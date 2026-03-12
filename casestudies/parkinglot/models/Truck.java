package casestudies.parkinglot.models;

import casestudies.parkinglot.emums.VehicleSize;

public class Truck extends  Vehicle {
    public Truck( String lisencePlate) {
        super(VehicleSize.LARGE, lisencePlate);
    }
}
