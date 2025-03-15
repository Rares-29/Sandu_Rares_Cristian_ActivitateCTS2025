// File: Bill.java
package restaurant.payment;

import restaurant.food.Order;
import restaurant.food.OrderItem;

public class Bill {
    public Order order;
    public double totalAmount;

    public Bill(Order o) {
        order = o;
        totalAmount = calculateBill();
    }

    // Messy: Duplicate tax calculation
    public double calculateBill() {
        double total = 0;
        for(OrderItem oi : order.orderItems) {
            total += oi.quantity * oi.unitPrice;
        }
        // Add tax twice mistakenly
        total = total + total * 0.1;
        total = total + total * 0.1;
        return total;
    }

    public void printBill() {
        System.out.println("----- Bill for Table " + order.getTableNumber() + " -----");
        for(OrderItem oi : order.orderItems) {
            System.out.println(oi.itemName + " x" + oi.quantity + " - $" + oi.unitPrice);
        }
        System.out.println("Total Amount (with double tax): $" + totalAmount);
        System.out.println("--------------------------------------");
    }

    // Extra method duplicating bill calculation
    public void displayBill() {
        printBill();
    }

    // Unused method for potential discounts
    public double applyDiscount(double discount) {
        return totalAmount - discount;
    }
}
