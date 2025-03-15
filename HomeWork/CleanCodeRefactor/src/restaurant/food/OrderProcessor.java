package restaurant.food;

import java.util.List;

public class OrderProcessor {


    public static void processEachOrder(List<Order> orders) {
        for (Order o : orders) {
            String msg = o.getTableNumber() % 2 == 0 ? "Even table order detected: Table" : "Odd table order detected: Table ";
            System.out.println(msg);
            OrderPrinter.printOrder(o);
        }
    }
}
