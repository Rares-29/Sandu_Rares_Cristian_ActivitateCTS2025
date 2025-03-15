package classic_factory_method.wash_machine.product;

public interface WashOperation {

    public abstract void startOperation();
    public abstract void displayOnScreen();
    public abstract void displayCost();
    public abstract double getPrice();
}
