package classic_factory_method.car;

public class Main {

    public static void main(String[] args) {
        CarFactory bmwFactory = new BmwFactory();

        bmwFactory.createNCars(10);
        System.out.println(bmwFactory.getTotalCost());

        CarFactory audiFactory = new AudiFactory();
        audiFactory.createNCars(10);
        System.out.println(audiFactory.getTotalCost());

    }
}
