package restaurant.food;

public class OrderPrinter {
    public static void printOrder(Order o) {
        System.out.println("Order for Table " + o.tableNumber);
        for(OrderItem oi : o.orderItems) {
            System.out.println(oi.itemName + " x " + oi.quantity + " ($" + oi.unitPrice + " each)");
        }
        System.out.println("Total (with tax): $" + OrderCalculator.calculateTotal(o));
    }
}
