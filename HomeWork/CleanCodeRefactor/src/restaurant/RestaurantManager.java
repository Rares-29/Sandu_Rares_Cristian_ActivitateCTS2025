package restaurant;

import restaurant.employee.Employee;
import restaurant.food.Inventory;
import restaurant.food.Order;
import restaurant.payment.Feedback;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    public List<Table> tables;
    public List<Order> orders;
    public List<Employee> employees;
    public List<Reservation> reservations;
    public List<Feedback> feedbacks;

    public RestaurantManager() {
        this.tables = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }
    public void addTable(Table t) {
        tables.add(t);
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }


    public void addReservation(Reservation res) {
        reservations.add(res);
    }

    public void addFeedback(Feedback fb) {
        feedbacks.add(fb);
    }
}
