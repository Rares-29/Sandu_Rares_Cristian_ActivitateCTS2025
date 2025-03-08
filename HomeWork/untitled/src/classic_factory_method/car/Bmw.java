package classic_factory_method.car;

import java.util.Random;

public class Bmw extends Car{
    @Override
    public double getCost() {
        return 10000;
    }

    @Override
    public double repairProcess() {
        return 2000;
    }
}
