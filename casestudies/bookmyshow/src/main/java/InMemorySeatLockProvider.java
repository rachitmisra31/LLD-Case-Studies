package casestudies.bookmyshow.src.main.java;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemorySeatLockProvider implements SeatLockProvider {


    private final Map<Show,Map<Seat,SeatLock>> locks = new HashMap<>();
    private final int lockTimeout;

    public InMemorySeatLockProvider(int lockTimeout) {
        this.lockTimeout = lockTimeout;
    }

    @Override
    public void lockSeat(Show show, List<Seat> seat, User user, int lockTimeSeconds) {
       if(!locks.containsKey(show)) {
           locks.put(show, new HashMap<>());
       }
       for(Seat s : seat){
           if(isSeatLocked(show, s)){
               throw new RuntimeException("Seat is already locked: "+ s.getSeatId());
           }
           SeatLock seatLock = new SeatLock(show, user, s, LocalDateTime.now(), lockTimeSeconds);
           locks.get(show).put(s, seatLock);
       }
    }

    @Override
    public void unlockSeat(Show show, List<Seat> seat, User user) {
        if(!locks.containsKey(show)) {
            return;
        }
        for(Seat s : seat){
            SeatLock seatLock = locks.get(show).get(s);
            if(seatLock != null && seatLock.getUser().equals(user)){
                locks.get(show).remove(s);
            }
        }
    }

    @Override
    public boolean isSeatLocked(Show show, Seat seat) {
        return locks.containsKey(show) && locks.get(show).containsKey(seat)
                &&!locks.get(show).get(seat).isExpired();
    }

    @Override
    public boolean isSeatLockedByUser(Show show, User user, Seat seat) {
        return isSeatLocked(show, seat)&&
                locks.get(show).get(seat).getUser().equals(user);
    }
}