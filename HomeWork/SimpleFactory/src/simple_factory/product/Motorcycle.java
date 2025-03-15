package simple_factory.product;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting..");
    }
}
