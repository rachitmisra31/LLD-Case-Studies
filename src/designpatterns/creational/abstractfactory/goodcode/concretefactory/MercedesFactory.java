package designpatterns.creational.abstractfactory.goodcode.concretefactory;

import designpatterns.creational.abstractfactory.goodcode.Mercedes;
import designpatterns.creational.abstractfactory.goodcode.Vehicle;
import designpatterns.creational.abstractfactory.goodcode.VehicleFactory;

public class MercedesFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Mercedes();
    }
}
