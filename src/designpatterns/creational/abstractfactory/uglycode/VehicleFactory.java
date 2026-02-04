package designpatterns.creational.abstractfactory.uglycode;

import designpatterns.creational.abstractfactory.concreteclasses.Honda;
import designpatterns.creational.abstractfactory.concreteclasses.Mercedes;
import designpatterns.creational.abstractfactory.concreteclasses.Toyota;

public class VehicleFactory {

    public Vehicle createVehicle(String brand) {
        if(brand.equals("Honda")){
            return new Honda();
        } else if (brand.equals("Toyota")) {
            return new Toyota();
        }
        else if(brand.equals("Mercedes")){
            return new Mercedes();
        }
        else{
            throw new IllegalArgumentException("Unknown brand");
        }
    }
}
