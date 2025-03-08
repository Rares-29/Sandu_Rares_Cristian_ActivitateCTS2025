package classic_factory_method.car;

public abstract class CarFactory {

    double totalCost = 0;

    public abstract Car makeCar();

    public void createNCars(int n) {

        for (int i = 0 ; i < n; i++) {
            Car car = makeCar();
            while(!car.testBrakes() && !car.testEngine()) {
                double repairCost = car.repairProcess();
                totalCost += repairCost;
            }
            totalCost += car.getCost();
        }
    }

    public double getTotalCost() {
        return totalCost;
    }
}
