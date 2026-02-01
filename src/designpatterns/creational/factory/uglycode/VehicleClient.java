package designpatterns.creational.factory.uglycode;

public class VehicleClient {
    public static void main(String[] args) {
        String vehicleType = "car";
        Vehicle vehicle;
        if(vehicleType.equals("car")){
            vehicle = new Car();
        } else if (vehicleType.equals("bike")) {
            vehicle = new Bike();
        }
        else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
        vehicle.start();
        vehicle.stop();
    }

}
