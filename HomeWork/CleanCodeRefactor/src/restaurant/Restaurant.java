// File: Restaurant.java
package restaurant;

import restaurant.employee.Chef;
import restaurant.employee.Employee;
import restaurant.employee.Waiter;
import restaurant.food.*;
import restaurant.payment.Feedback;

import java.util.*;

public class Restaurant {
    public String name;
    public String address;
    public Menu menu;
    public Inventory inventory;

    public RestaurantManager manager;

    public Restaurant(String nm, String addr, RestaurantManager restaurantManager) {
        name = nm;
        address = addr;
        menu = new Menu();
        inventory = new Inventory();
        this.manager = restaurantManager;
    }

    public void setMenu(Menu m) {
        menu = m;
    }

    public void setInventory(Inventory inv) {
        inventory = inv;
    }


}
