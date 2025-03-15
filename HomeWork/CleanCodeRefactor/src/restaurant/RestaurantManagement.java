// File: RestaurantManagement.java
package restaurant;

import restaurant.employee.Chef;
import restaurant.employee.Employee;
import restaurant.employee.EmployeeWorker;
import restaurant.employee.Waiter;
import restaurant.food.*;
import restaurant.payment.Bill;
import restaurant.payment.Feedback;
import restaurant.payment.PaymentProcessor;

public class RestaurantManagement {
    public static void main(String[] args) {
        System.out.println("Starting Restaurant Management Simulation...");
        // Create restaurant
        RestaurantManager restaurantManager = new RestaurantManager();
        Restaurant r = new Restaurant("Messy Bites", "123 Food Street", restaurantManager);

        // Setup Menu
        Menu m = new Menu();
        m.addMenuItem(new MenuItem("Burger", "A juicy burger with cheese", 9.99));
        m.addMenuItem(new MenuItem("Pizza", "Delicious cheesy pizza", 12.99));
        m.addMenuItem(new MenuItem("Salad", "Fresh garden salad", 7.99));
        m.addMenuItem(new MenuItem("Pasta", "Italian pasta with red sauce", 11.49));
        m.addMenuItem(new MenuItem("Soup", "Hot tomato soup", 5.49));
        r.setMenu(m);

        // Setup Tables
        for (int i = 1; i <= 5; i++) {
            if(i % 2 == 0) {
                r.manager.addTable(new Table(i, 4));
            } else {
                r.manager.addTable(new Table(i, 2));
            }
        }

        // Setup Employees
        r.manager.addEmployee(new Waiter("Alice", "W001", 2));
        r.manager.addEmployee(new Waiter("Bob", "W002", 3));
        r.manager.addEmployee(new Chef("Charlie", "C001", "Italian"));
        r.manager.addEmployee(new Chef("Dave", "C002", "Continental"));

        // Create a Customer and Order
        Customer cust = new Customer("John Doe", "555-1234", "john@example.com");
        Order order = new Order(cust, 1);
        order.addOrderItem(new OrderItem("Burger", 2, 9.99));
        order.addOrderItem(new OrderItem("Pasta", 1, 11.49));
        r.manager.addOrder(order);

        // Process Bill and Payment
        Bill bill = new Bill(order);
        PaymentProcessor pp = new PaymentProcessor();
        pp.processPayment(bill, "credit");

        // Inventory setup
        Inventory inv = new Inventory();
        inv.addIngredient(new Ingredient("Tomato", 100));
        inv.addIngredient(new Ingredient("Cheese", 50));
        inv.addIngredient(new Ingredient("Lettuce", 30));
        inv.addIngredient(new Ingredient("Bacon", 20));
        r.setInventory(inv);

        // Reservation and Feedback
        Reservation resv = new Reservation(cust, 2, "2025-04-01");
        r.manager.addReservation(resv);

        Feedback fb = new Feedback(cust, 3, "Service was okay, food could be better.");
        r.manager.addFeedback(fb);

        EmployeeWorker employeeWorker = new EmployeeWorker(r.manager.employees);
        InventoryStock inventoryStock = new InventoryStock(r.inventory);
        RestaurantWorker restaurantWorker = new RestaurantWorker(inventoryStock, employeeWorker, r);

        // Simulate daily operations with extra loops and duplicate tasks
        restaurantWorker.doDailyOperations();
        for (int j = 0; j < 2; j++) {
            System.out.println("Extra simulation loop: " + j);
            restaurantWorker.doDailyOperations();
        }

        // Create a duplicate order to add more mess
        Order order2 = new Order(cust, 2);
        order2.addOrderItem(new OrderItem("Pizza", 2, 12.99));
        order2.addOrderItem(new OrderItem("Burger", 1, 9.99));
        r.manager.addOrder(order2);

        // Extra print statements and messy calls
        System.out.println("Simulation complete. Enjoy cleaning up the code!");
        System.out.println("Remember: Duplicate logic is everywhere.");
        System.out.println("Good luck refactoring!");

        int punctaj = 1;
        boolean raspunsCorect = punctaj == 0;
        System.out.println(raspunsCorect);
    }
}
