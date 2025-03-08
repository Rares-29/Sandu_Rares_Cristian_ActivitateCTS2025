package classic_factory_method.car;

public class TeslaFactory extends CarFactory {
    @Override
    public Car makeCar() {
        return new Tesla();
    }
}
