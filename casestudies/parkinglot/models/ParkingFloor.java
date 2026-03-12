package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;

import java.math.BigDecimal;
import java.util.List;

public class ParkingFloor {
    private int floorNum;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(int floorNum, List<ParkingSpot> parkingSpots) {
        this.floorNum = floorNum;
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public ParkingSpot findAvailableParkingSpots(VehicleSize vehicleSize) {
        for (ParkingSpot spot : parkingSpots) {
            if(spot.isAvailable() && vehicleSize.ordinal()<spot.getSize().ordinal()){
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
