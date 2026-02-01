package designpatterns.creational.factory.goodcode;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new BIke();
        }
        else{
            throw new IllegalArgumentException("invalid type");
        }
    }
}
