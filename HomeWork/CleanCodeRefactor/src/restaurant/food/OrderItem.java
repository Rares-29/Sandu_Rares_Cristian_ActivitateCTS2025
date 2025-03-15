// File: OrderItem.java
package restaurant.food;

public class OrderItem {
    public String itemName;
    public int quantity;
    public double unitPrice;

    public OrderItem(String nm, int qty, double price) {
        itemName = nm;
        quantity = qty;
        unitPrice = price;
    }

    // Duplicate method: returns a short description
    public String getOrderDetails() {
        return itemName + " x" + quantity;
    }


}
