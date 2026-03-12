package casestudies.parkinglot.strategy;

import casestudies.parkinglot.emums.VehicleSize;
import casestudies.parkinglot.models.ParkingFloor;
import casestudies.parkinglot.models.ParkingSpot;

import java.util.List;

public class NearestSpotStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot findSpot(List<ParkingFloor> floors, VehicleSize size) {
        for(ParkingFloor floor : floors){
            ParkingSpot spot = floor.findAvailableParkingSpots(size);
            if(spot != null){
                return spot;
            }
        }
        return null;
    }
}
