package casestudies.parkinglot;

import casestudies.parkinglot.emums.VehicleSize;
import casestudies.parkinglot.models.*;
import casestudies.parkinglot.strategy.FeeStrategy;
import casestudies.parkinglot.strategy.HourlyFeeStrategy;
import casestudies.parkinglot.strategy.NearestSpotStrategy;
import casestudies.parkinglot.strategy.SpotAllocationStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingSpot parkingSpot1 = new ParkingSpot("A1", VehicleSize.LARGE);
        ParkingSpot parkingSpot2 = new ParkingSpot("N1", VehicleSize.SMALL);
        ParkingSpot parkingSpot3 = new ParkingSpot("M1", VehicleSize.MEDIUM);

        List<ParkingSpot> parkingSpots = List.of(parkingSpot1, parkingSpot2, parkingSpot3);

        ParkingFloor floors = new ParkingFloor(1, parkingSpots);

        ParkingLot lot = new ParkingLot(List.of(floors), new HourlyFeeStrategy(50), new NearestSpotStrategy());
        Vehicle car = new Car("Abcd123");
        ParkingTicket parkingTicket = lot.parkTicket(car);
        System.out.println("Parking Ticket: " + parkingTicket.getTicketId());

        double fee = lot.unparkTicket(parkingTicket.getTicketId());

        System.out.println("Vehicle unparked. Fee pais is: " + fee);
    }
}
