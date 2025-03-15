package classic_factory_method.wash_machine.product;

public class WaterOperation implements WashOperation{

    public final static int price = 5;
    public final static long totalTime = 60;

    @Override
    public void startOperation() {
        System.out.println("Preparing the machine to push water out...");
    }

    @Override
    public void displayOnScreen() {
        Long timeLeft = totalTime;
        while(timeLeft != 0) {
            timeLeft--;
            try {
                Thread.sleep(1000);

            }catch(InterruptedException ie) {
                System.out.println("error");
            }
            System.out.println("Time left: " + timeLeft);
        }
    }

    @Override
    public void displayCost() {
        System.out.println("Cost: " + getPrice());
    }

    @Override
    public double getPrice() {
        return price;
    }
}
