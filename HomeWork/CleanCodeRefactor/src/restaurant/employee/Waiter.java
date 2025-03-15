// File: Waiter.java
package restaurant.employee;

import restaurant.food.Order;
import restaurant.food.OrderPrinter;

public class Waiter extends Employee {
    public int assignedTables;

    public Waiter(String name, String id, int tables) {
        super(name, id);
        assignedTables = tables;
    }

    public void serveOrder(Order o) {
        System.out.println("Waiter " + empName + " is serving order at table " + o.getTableNumber());
    }


    public void takeOrder(Order o, int tableNum) {
        System.out.println("Taking order for table " + tableNum);
        OrderPrinter.printOrder(o);
    }

    // Extra method duplicating work
    public void processOrder(Order o) {
        System.out.println("Processing order for table " + o.getTableNumber());
        serveOrder(o);
    }

}
