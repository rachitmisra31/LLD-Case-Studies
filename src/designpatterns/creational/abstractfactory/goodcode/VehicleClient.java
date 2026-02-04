package designpatterns.creational.abstractfactory.goodcode;

import designpatterns.creational.abstractfactory.goodcode.concretefactory.HondaFactory;

public class VehicleClient {

    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();
    }
}
