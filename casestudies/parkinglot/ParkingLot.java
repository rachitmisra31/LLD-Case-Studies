package casestudies.parkinglot;

import casestudies.parkinglot.exception.ParkingException;
import casestudies.parkinglot.models.ParkingFloor;
import casestudies.parkinglot.models.ParkingSpot;
import casestudies.parkinglot.models.ParkingTicket;
import casestudies.parkinglot.models.Vehicle;
import casestudies.parkinglot.strategy.FeeStrategy;
import casestudies.parkinglot.strategy.SpotAllocationStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {

    private List<ParkingFloor> floors;
    private Map<String, ParkingTicket> activeTickets;
    private FeeStrategy feeStrategy;
    private SpotAllocationStrategy strategy;

    public ParkingLot(List<ParkingFloor> floors, FeeStrategy feeStrategy, SpotAllocationStrategy strategy) {
        this.activeTickets = new ConcurrentHashMap<>();
        this.floors = floors;
        this.feeStrategy = feeStrategy;
        this.strategy = strategy;
    }

    public ParkingTicket parkTicket(Vehicle vehicle) {
        ParkingSpot spot = strategy.findSpot(floors, vehicle.getSize());
        if(spot == null){
            throw new ParkingException("Parking is full!!");
        }

        spot.parkVehicle(vehicle);

        ParkingTicket parkingTicket = new ParkingTicket(vehicle, spot);
        activeTickets.put(parkingTicket.getTicketId(), parkingTicket);

        return parkingTicket;
    }

    public double unparkTicket(String ticketId) {
        ParkingTicket parkingTicket = activeTickets.get(ticketId);
        if(parkingTicket == null){
            throw new ParkingException("Ticket is invalid!!");
        }
        double fee = feeStrategy.calculateFee(parkingTicket);
        parkingTicket.closeTicket();
        parkingTicket.getParkingSpot().unparkVehicle(parkingTicket.getVehicle());
        activeTickets.remove(ticketId);
        return fee;
    }
}
