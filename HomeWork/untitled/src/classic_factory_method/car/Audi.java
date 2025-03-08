package classic_factory_method.car;

public class Audi extends Car{
    @Override
    public double getCost() {
        return 7000;
    }

    @Override
    public double repairProcess() {
        return 1500;
    }
}
