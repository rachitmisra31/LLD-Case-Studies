package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;
import casestudies.parkinglot.exception.ParkingException;

public class ParkingSpot {

    private String spotId;
    private Vehicle parkedVehicle;
    private VehicleSize size;

    public ParkingSpot(String spotId, VehicleSize size) {
        this.spotId = spotId;
        this.size = size;
    }

    public Vehicle parkVehicle(Vehicle vehicle){
        if(vehicle.getSize().ordinal()> size.ordinal()){
            throw new ParkingException("Vehicle cannot be parked here");
        }

        this.parkedVehicle = vehicle;
        return parkedVehicle;
    }

    public void unparkVehicle(Vehicle vehicle){
        if(parkedVehicle == null){
            throw new ParkingException("Vehicle already unparked");
        }
        parkedVehicle = null;
    }

    public boolean isAvailable(){
        return parkedVehicle == null;
    }
    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public Vehicle getVehicle() {
        return parkedVehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public VehicleSize getSize() {
        return size;
    }
}
