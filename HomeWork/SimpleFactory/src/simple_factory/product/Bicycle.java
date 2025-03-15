package simple_factory.product;

public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bicycle is starting...");
    }
}
