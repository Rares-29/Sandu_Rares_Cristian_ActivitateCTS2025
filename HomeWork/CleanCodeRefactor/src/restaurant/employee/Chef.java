// File: Chef.java
package restaurant.employee;

import restaurant.food.Order;
import restaurant.food.OrderItem;

public class Chef extends Employee {
    public String specialty;

    public Chef(String name, String id, String spec) {
        super(name, id);
        specialty = spec;
    }

    public void prepareDish(String dishName) {
        System.out.println("Chef " + empName + " is preparing " + dishName + " with specialty " + specialty);
        work();
    }

    public void prepareOrder(Order o) {
        System.out.println("Chef " + empName + " is preparing order for table " + o.getTableNumber());
        for(OrderItem oi : o.orderItems) {
            prepareDish(oi.itemName);
        }
    }

}
