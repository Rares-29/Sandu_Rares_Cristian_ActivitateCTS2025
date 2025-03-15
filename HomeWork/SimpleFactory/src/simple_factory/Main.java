package simple_factory;

import simple_factory.product.Vehicle;

public class Main {
    public static void main(String[] args) {


        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle v = vehicleFactory.getVehicle(VehicleType.BICYCLE);
        v.start();
    }
}