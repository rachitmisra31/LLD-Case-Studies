package factory;

public class VehicleClient {
    private Vehicle vehicle;
    public VehicleClient(VehicleFactory vehicleFactory) {
       vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}