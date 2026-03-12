package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;

public class Car extends Vehicle {

    public Car(String plate){
        super(VehicleSize.MEDIUM, plate);
    }
}
