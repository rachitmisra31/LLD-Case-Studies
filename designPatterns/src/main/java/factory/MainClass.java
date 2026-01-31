package factory;

public class MainClass {

    public static void main(String[] args) {
        VehicleFactory fourWheelerVehicleFactory = new FourWheelerFactory();
        VehicleClient fourWheelerClient = new VehicleClient(fourWheelerVehicleFactory);
        Vehicle fourWheelerVehicle = fourWheelerClient.getVehicle();
        fourWheelerVehicle.printVehicle();
    }
}