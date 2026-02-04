import java.util.List;

public class Booking {
    private final User user;
    private final String bookingId;
    private final Show show;
    private final List<Seat> bookedSeats;
    private BOOKINGSTATUS status;

    public Booking(User user, String bookingId, Show show, List<Seat> bookedSeats) {

        this.user = user;
        this.bookingId = bookingId;
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.status = status;
    }

    public void confirm(){
        this.status = BOOKINGSTATUS.CONFIRMED;
    }
    public boolean isConfirmed(){
        return this.status == BOOKINGSTATUS.CONFIRMED;
    }
    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public User getUser() {
        return user;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Show getShow() {
        return show;
    }
}