package classic_factory_method.car;

public class BmwFactory extends CarFactory{


    @Override
    public Car makeCar() {
        return new Bmw();
    }
}
