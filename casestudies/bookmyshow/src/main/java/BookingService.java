package casestudies.bookmyshow.src.main.java;

import java.util.*;

public class BookingService {

    private static BookingService instance;
    private final SeatLockProvider seatLockProvider;
    private final Map<String, Booking> bookings = new HashMap<>();
    public BookingService(SeatLockProvider seatLockProvider) {
        this.seatLockProvider = seatLockProvider;
    }
    public static BookingService getInstance(SeatLockProvider seatLockProvider) {
        if (instance == null) {
            instance = new BookingService(seatLockProvider);
        }
        return instance;
    }
    public Booking createBooking(User user, Show show, List<Seat> selectedSeats) {
        for(Seat seat : selectedSeats) {
            if(seatLockProvider.isSeatLocked(show, seat)) {
                throw new RuntimeException("Seat already locked or booked by user: "+user);
            }
        }
        seatLockProvider.lockSeat(show, selectedSeats, user, 30);
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(user, bookingId, show, selectedSeats);
        bookings.put(bookingId, booking);
        return booking;
    }

    public Booking getBooking(String bookingId) {
        return bookings.get(bookingId);
    }

    public List<Booking> getAllBookings() {
        return  new ArrayList<>(bookings.values());
    }

    public void confirmBooking(String bookingId, User user) {
        Booking booking = bookings.get(bookingId);
        if(booking == null) {
            throw new RuntimeException("Booking not found");
        }
        if(!booking.getUser().getUserId().equals(booking.getUser().getUserId()) ) {
            throw new RuntimeException("User not authorized to confirm booking");
        }
        if(booking.isConfirmed()){
            throw new RuntimeException("Booking is already confirmed for this user ");
        }

        booking.confirm();
    }
}
