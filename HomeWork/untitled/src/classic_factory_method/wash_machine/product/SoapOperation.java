package classic_factory_method.wash_machine.product;

public class SoapOperation implements WashOperation{

    public final static int price = 5;
    @Override
    public void startOperation() {
        System.out.println("Soap operation");
    }

    @Override
    public void displayOnScreen() {

    }

    @Override
    public void displayCost() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
