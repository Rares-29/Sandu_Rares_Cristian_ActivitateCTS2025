package classic_factory_method.car;

import java.util.Random;

public abstract class Car {
    public abstract double getCost();
    public boolean testEngine() {
            return new Random().nextBoolean();
    };
    public boolean testBrakes() {
        return new Random().nextBoolean();
    };

    public abstract double repairProcess();
}
