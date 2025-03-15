// File: Order.java
package restaurant.food;

import restaurant.Customer;

import java.util.*;

public class Order {
    public Customer customer;
    public int tableNumber;
    public List<OrderItem> orderItems;

    public Order(Customer cust, int tableNum) {
        customer = cust;
        tableNumber = tableNum;
        orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
        // Duplicate logic: if quantity > 1 add a duplicate item
        if(item.quantity > 1) {
            orderItems.add(new OrderItem(item.itemName, 1, item.unitPrice));
        }
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void printOrder() {
        System.out.println("Order for Table " + tableNumber);
        for(OrderItem oi : orderItems) {
            System.out.println(oi.itemName + " x " + oi.quantity + " ($" + oi.unitPrice + " each)");
        }
        System.out.println("Total (with tax): $" + OrderCalculator.calculateTotal(this));
    }

}
