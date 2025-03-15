package restaurant;

import restaurant.employee.Chef;
import restaurant.employee.Employee;
import restaurant.employee.EmployeeWorker;
import restaurant.employee.Waiter;
import restaurant.food.*;
import restaurant.payment.Feedback;

import java.util.List;

public class RestaurantWorker {


    InventoryStock inventoryStock;
    EmployeeWorker employeeWorker;
    Restaurant r;

    public RestaurantWorker(InventoryStock inventoryStock, EmployeeWorker employeeWorker, Restaurant r) {
        this.inventoryStock = inventoryStock;
        this.employeeWorker = employeeWorker;
        this.r = r;
    }

    public void doDailyOperations() {
        System.out.println("=== Daily Operations Start ===");

        OrderProcessor.processEachOrder(r.manager.orders);
        inventoryStock.restockIngredients();
        employeeWorker.work();

//        for(Reservation res : reservations) {
//            res.showReservation();
//        }
//        for(Feedback fb : feedbacks) {
//            fb.showFeedback();
//        }
//        System.out.println("=== Daily Operations End ===");

    }
}
