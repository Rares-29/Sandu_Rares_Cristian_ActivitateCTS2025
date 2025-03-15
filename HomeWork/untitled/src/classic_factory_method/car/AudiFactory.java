package classic_factory_method.car;

public class AudiFactory extends CarFactory{
    @Override
    public Car makeCar() {
        return new Audi();
    }

}
