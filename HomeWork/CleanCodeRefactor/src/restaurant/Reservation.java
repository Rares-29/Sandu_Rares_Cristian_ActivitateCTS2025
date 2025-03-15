// File: Reservation.java
package restaurant;

public class Reservation {
    public Customer customer;
    public int tableNumber;
    public String date;

    public Reservation(Customer cust, int tableNum, String d) {
        customer = cust;
        tableNumber = tableNum;
        date = d;
    }

    public void printReservation() {
        System.out.println("Reservation for " + customer.custName + " at table " + tableNumber + " on " + date);
        System.out.println("Please arrive 10 minutes early.");
    }

    public void showReservation() {
        printReservation();
    }

    public void confirmReservation() {
        System.out.println("Reservation confirmed for table " + tableNumber + " on " + date);
    }
}
