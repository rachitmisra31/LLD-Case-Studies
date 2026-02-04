package designpatterns.creational.factory.goodcode;

public class VehicleClient {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        vehicle.start();

        Vehicle vehicle2 = VehicleFactory.getVehicle("bike");
        vehicle2.start();
    }
}
