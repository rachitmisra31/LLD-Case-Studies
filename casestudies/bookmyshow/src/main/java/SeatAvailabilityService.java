package casestudies.bookmyshow.src.main.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeatAvailabilityService {

    private final BookingService bookingService;
    private final SeatLockProvider seatLockProvider;
    public SeatAvailabilityService(SeatLockProvider seatLockProvider, BookingService bookingService) {
        this.seatLockProvider = seatLockProvider;
        this.bookingService = new BookingService(seatLockProvider);
    }
    public List<Seat> getAvailableSeats(Show show) {

           List<Seat> allSeats = show.getScreen().getSeats();
            Set<String> lockedSeatIds = new HashSet<>();
            Set<String> bookedSeatIds = new HashSet<>();

            for(Seat seat : allSeats) {
            if(seatLockProvider.isSeatLocked(show, seat)) {
                lockedSeatIds.add(seat.getSeatId());
            }
        }
            List<Booking> bookings = bookingService.getAllBookings();
            for(Booking booking : bookings) {
                if(booking.getShow().equals(show) && booking.isConfirmed()) {
                    for(Seat seat : booking.getBookedSeats()) {
                        bookedSeatIds.add(seat.getSeatId());
                    }
                }
            }
            List<Seat>availableSeats = new ArrayList<>();
            for(Seat seat : allSeats) {
                if(!lockedSeatIds.contains(seat.getSeatId()) && !bookedSeatIds.contains(seat.getSeatId())) {
                    availableSeats.add(seat);
                }
            }
            return availableSeats;
    }
}