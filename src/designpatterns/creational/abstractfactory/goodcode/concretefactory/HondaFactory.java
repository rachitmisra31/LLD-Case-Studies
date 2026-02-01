package designpatterns.creational.abstractfactory.goodcode.concretefactory;


import designpatterns.creational.abstractfactory.goodcode.Honda;
import designpatterns.creational.abstractfactory.goodcode.Vehicle;
import designpatterns.creational.abstractfactory.goodcode.VehicleFactory;

public class HondaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
