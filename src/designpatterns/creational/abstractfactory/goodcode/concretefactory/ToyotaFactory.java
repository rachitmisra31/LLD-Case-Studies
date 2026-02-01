package designpatterns.creational.abstractfactory.goodcode.concretefactory;

import designpatterns.creational.abstractfactory.goodcode.Toyota;
import designpatterns.creational.abstractfactory.goodcode.Vehicle;
import designpatterns.creational.abstractfactory.goodcode.VehicleFactory;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
