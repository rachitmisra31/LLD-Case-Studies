import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
        User user = new User("JohnDoe@xyz.com", "john123");

        Movie movie = new Movie("abc123", "Interstellar");

        Seat seat1 = new Seat(SEAT_TYPE.PREMIUM, "P1");
        Seat seat2 = new Seat(SEAT_TYPE.RECLINER, "P2");

        List<Seat> seats = Arrays.asList(seat1, seat2);

        Screen screen = new Screen("mbvc", "Audi2", 3, seats);
        Theater theater = new Theater("PVR", "adw2", Arrays.asList(screen));
        Show show = new Show("erwq", movie, screen, LocalDateTime.now().plusHours(1));

        SeatLockProvider seatLockProvider = new InMemorySeatLockProvider(300);
        BookingService bookingService = new BookingService(seatLockProvider);
        SeatAvailabilityService seatAvailabilityService = new SeatAvailabilityService(seatLockProvider, bookingService);

        System.out.println("Available seats before booking ");
        for (Seat s : seatAvailabilityService.getAvailableSeats(show)) {
            System.out.println(s.getSeatId());
        }
        Booking booking = bookingService.createBooking(user, show, Arrays.asList(seat1));

        bookingService.confirmBooking(booking.getBookingId(), user);
        System.out.println("Booking confirmed!! ");

        System.out.println("Available seats after booking ");
        for (Seat s : seatAvailabilityService.getAvailableSeats(show)) {
            System.out.println(s.getSeatId());
        }

    }
}