package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;

public class Bike extends Vehicle {
    public Bike(String plate){
        super(VehicleSize.SMALL, plate);
    }
}
