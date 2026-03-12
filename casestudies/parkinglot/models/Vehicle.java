package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;
import casestudies.parkinglot.exception.ParkingException;

public class Vehicle {

    public VehicleSize size;
    public String lisencePlate;

    public Vehicle(VehicleSize size, String lisencePlate) {

        if(lisencePlate == null) {
            throw new ParkingException("Invalid Lisence Plate");
        }
        this.size = size;
        this.lisencePlate = lisencePlate;
    }

    public VehicleSize getSize() {
        return size;
    }

    public String getLisencePlate() {
        return lisencePlate;
    }
}