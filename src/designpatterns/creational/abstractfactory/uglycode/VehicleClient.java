package designpatterns.creational.abstractfactory.uglycode;

import designpatterns.creational.abstractfactory.uglycode.Vehicle;

public class VehicleClient {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle honda = vehicleFactory.createVehicle("Honda");
        honda.start();
        honda.stop();


    }
}
