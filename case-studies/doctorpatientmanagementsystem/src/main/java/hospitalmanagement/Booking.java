package hospitalmanagement;

import java.time.LocalTime;
import java.util.UUID;

public class Booking {
    private final String id;
    private final Patient patient;
    private final Doctor doctor;
    private final LocalTime slot;
    private BookingStatus status;

    public Booking(Patient p, Doctor d, LocalTime t, BookingStatus status) {
        this.id = UUID.randomUUID().toString().substring(0,8);
        this.patient = p;
        this.doctor = d;
        this.slot = t;
        this.status = status;
    }

    public String getId() { return id; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public LocalTime getSlot() { return slot; }
    public BookingStatus getStatus() { return status; }
    public void setStatus(BookingStatus s) { this.status = s; }
}

