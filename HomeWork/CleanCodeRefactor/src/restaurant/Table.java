// File: Table.java
package restaurant;

public class Table {
    public int tableNo;
    public int capacity;
    public boolean isOccupied;

    public Table(int no, int cap) {
        tableNo = no;
        capacity = cap;
        isOccupied = false;
    }

    public void occupyTable() {
        isOccupied = true;
    }

    public void freeTable() {
        isOccupied = false;
    }

    // Messy: redundant toggle method
    public void toggleOccupancy() {
        if(isOccupied == true) {
            isOccupied = false;
        } else {
            isOccupied = true;
        }
    }

    public void printTableStatus() {
        System.out.println("Table " + tableNo + " (Capacity: " + capacity + ") - " + (isOccupied ? "Occupied" : "Free"));
    }

    // Extra method with duplicate functionality
    public void displayStatus() {
        printTableStatus();
    }

    // Another useless method
    public void dummyMethod() {
        // No operation
    }
}
