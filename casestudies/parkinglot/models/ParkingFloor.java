package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;

import java.math.BigDecimal;
import java.util.List;

public class ParkingFloor {
    private BigDecimal floorNum;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(BigDecimal floorNum, List<ParkingSpot> parkingSpots) {
        this.floorNum = floorNum;
        this.parkingSpots = parkingSpots;
    }

    public BigDecimal getFloorNum() {
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
