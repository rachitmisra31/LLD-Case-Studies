package casestudies.bookmyshow.src.main.java;

import java.time.LocalDateTime;

public class SeatLock {
    private final Show show;
    private final User user;
    private final Seat seat;
    private final LocalDateTime lockTime;
    private final int lockDurationSeconds;

    public SeatLock(Show show, User user, Seat seat, LocalDateTime lockTime, int lockDurationSeconds) {
        this.show = show;
        this.user = user;
        this.seat = seat;
        this.lockTime = lockTime;
        this.lockDurationSeconds = lockDurationSeconds;
    }
    public User getUser() {
        return user;
    }
    public Seat getSeat() {
        return seat;
    }
    public LocalDateTime getLockTime() {
        return lockTime;
    }
    public int getLockDurationSeconds() {
        return lockDurationSeconds;
    }

    public Show getShow() {
        return show;
    }

    public boolean isExpired() {
        return lockTime.plusSeconds(lockDurationSeconds).isBefore(LocalDateTime.now());
    }
}
