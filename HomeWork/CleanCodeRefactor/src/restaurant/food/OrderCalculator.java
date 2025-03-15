package restaurant.food;

public class OrderCalculator {

    public static double calculateTotal(Order o) {
        double total = 0;
        for (OrderItem oi : o.orderItems) {
            total += oi.quantity * oi.unitPrice;
        }
        // Adding tax in a confusing way
        total = total + total * 0.1;
        return total;
    }
}
