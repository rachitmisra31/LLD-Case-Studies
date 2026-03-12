package casestudies.parkinglot.models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class ParkingTicket {

    private String ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public ParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketId = UUID.randomUUID().toString();
        this.entryTime = LocalDateTime.now();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public long getDurationInHours(){
        LocalDateTime end = (exitTime == null) ? LocalDateTime.now() : exitTime;
        long hours = ChronoUnit.HOURS.between(entryTime, end);
        return Math.max(1, hours);
    }

    public String getTicketId() {
        return ticketId;
    }

    public void closeTicket(){
        this.exitTime = LocalDateTime.now();
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


}
