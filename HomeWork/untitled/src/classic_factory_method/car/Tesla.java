package classic_factory_method.car;

import java.util.Random;

public class Tesla extends Car{
    @Override
    public double getCost() {
        return 15000;
    }

    @Override
    public double repairProcess() {
        return 5000;
    }
}
