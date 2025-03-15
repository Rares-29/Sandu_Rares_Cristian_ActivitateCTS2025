// File: MenuItem.java
package restaurant.food;

public class MenuItem {
    public String itemName;
    public String itemDesc;
    public double price;

    public MenuItem(String nm, String desc, double pr) {
        itemName = nm;
        itemDesc = desc;
        price = pr;
    }

    @Override
    public String toString() {
        return itemName + " - " + itemDesc + " ($" + price + ")";
    }

}
