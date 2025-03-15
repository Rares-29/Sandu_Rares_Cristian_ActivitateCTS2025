package simple_factory;

import simple_factory.product.Bicycle;
import simple_factory.product.Car;
import simple_factory.product.Motorcycle;
import simple_factory.product.Vehicle;

public class VehicleFactory {


    public Vehicle getVehicle(VehicleType type) {
        switch(type) {
            case BICYCLE -> {
                return new Bicycle();
            }
            case MOTORCYCLE -> {
                return new Motorcycle();
            }
            case CAR -> {
                return new Car();
            }
            default -> throw new IllegalArgumentException("Invalid vehicle type: " + type);

        }
    }
}
