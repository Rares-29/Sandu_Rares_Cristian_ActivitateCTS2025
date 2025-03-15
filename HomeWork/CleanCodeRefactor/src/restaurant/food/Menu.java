// File: Menu.java
package restaurant.food;

import java.util.*;

public class Menu {
    public List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        items.add(item);
    }
    public void printMenu() {
        System.out.println("----- Menu -----");
        for (MenuItem it : items) {
            System.out.println(it.itemName + ": " + it.itemDesc + " - $" + it.price);
        }
        System.out.println("----------------");
    }


    public double calculateTotalPrice() {
        double total = 0;
        for (MenuItem m : items) {
            total = total + m.price;
        }
        return total;
    }
}
