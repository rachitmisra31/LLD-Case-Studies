package casestudies.bookmyshow.src.main.java;

import java.util.List;

public interface SeatLockProvider {

    void lockSeat(Show show, List<Seat> seat, User user, int lockTimeSeconds);
    void unlockSeat(Show show, List<Seat> seat, User user);
    boolean isSeatLocked(Show show, Seat seat);
    boolean isSeatLockedByUser(Show show, User user, Seat seat);
}
