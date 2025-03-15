package classic_factory_method.wash_machine.product;

public class WaterSoapOperation implements WashOperation{

    public final static int price = 5;
    @Override
    public void startOperation() {

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
