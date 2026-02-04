package hospitalmanagement;

import java.time.LocalTime;
import java.util.*;

public class BookingService {
    private final DoctorRegistryService reg;
    private final DoctorAvailabilityService avail;
    private final Map<String, Booking> byBookingId = new HashMap<>();
    private final Map<LocalTime, Queue<Booking>> waitlists = new HashMap<>();

    public BookingService(DoctorRegistryService reg, DoctorAvailabilityService avail){
        this.reg=reg; this.avail=avail;
    }

    public String book(Patient p, Doctor d, LocalTime slot, boolean waitlist) {
        if (avail.isDoctorBusy(d.getId(), slot)) {
            if (waitlist) {
                String id = new Booking(p,d,slot, BookingStatus.WAITLISTED).getId();
                waitlists.computeIfAbsent(slot, k->new LinkedList<>()).add(byBookingId.put(id, new Booking(p,d,slot, BookingStatus.WAITLISTED)));
                return "Added to the waitlist. Booking id: " + id;
            }
            return "Doctor busy";
        }
        avail.bookSlot(d,slot);
        Booking b = new Booking(p,d,slot, BookingStatus.CONFIRMED);
        byBookingId.put(b.getId(), b);
        return "Booked. Booking id: " + b.getId();
    }

    public String cancel(String bookingId) {
        Booking b = byBookingId.get(bookingId);
        if (b==null) return "Booking not found";
        b.setStatus(BookingStatus.CANCELLED);
        avail.cancelSlot(b.getDoctor(), b.getSlot());
        Queue<Booking> q = waitlists.get(b.getSlot());
        if (q!=null && !q.isEmpty()) {
            Booking next = q.poll();
            next.setStatus(BookingStatus.CONFIRMED);
            avail.bookSlot(next.getDoctor(), next.getSlot());
            byBookingId.put(next.getId(), next);
            return "Booking Cancelled\nBooking confirmed for Booking id: " + next.getId();
        }
        return "Booking Cancelled";
    }

    public List<Booking> getByPatient(Patient p) {
        List<Booking> out = new ArrayList<>();
        for (Booking b : byBookingId.values())
            if (b.getPatient().getId().equals(p.getId()) && b.getStatus()==BookingStatus.CONFIRMED)
                out.add(b);
        return out;
    }
}