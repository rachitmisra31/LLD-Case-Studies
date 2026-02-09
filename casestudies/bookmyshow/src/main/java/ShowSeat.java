package casestudies.bookmyshow.src.main.java;

public class ShowSeat {

    private final Seat seat;
    private final Show show;
    private SeatStatus status;

    public ShowSeat(Seat seat, Show show, SeatStatus status) {
        this.seat = seat;
        this.show = show;
        this.status = status;
    }

    public Seat getSeat() {
        return seat;
    }
    public Show getShow() {
        return show;
    }

    public SeatStatus getStatus() {
        return status;
    }
    public void setStatus(SeatStatus status) {
        this.status = status;
    }

}