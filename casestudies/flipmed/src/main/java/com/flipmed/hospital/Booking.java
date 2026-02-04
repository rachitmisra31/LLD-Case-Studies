package com.flipmed.hospital;

public class Booking {

    private final String bookingId;
    private final Patient patient;
    private final Doctor doctor;
    private BookingStatus status;

    public Booking(String bookingId, Patient patient, Doctor doctor, BookingStatus status) {
        this.bookingId = bookingId;
        this.patient = patient;
        this.doctor = doctor;
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public BookingStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", status=" + status +
                '}';
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
