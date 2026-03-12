package casestudies.parkinglot.strategy;

import casestudies.parkinglot.emums.VehicleSize;
import casestudies.parkinglot.models.ParkingFloor;
import casestudies.parkinglot.models.ParkingSpot;

import java.util.List;

public interface SpotAllocationStrategy {
    ParkingSpot findSpot(List<ParkingFloor> floor, VehicleSize size);
}
