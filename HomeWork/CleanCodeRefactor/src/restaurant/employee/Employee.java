// File: Employee.java
package restaurant.employee;

public class Employee {
    public String empName;
    public String empId;


    public Employee(String name, String id) {
        empName = name;
        empId = id;
    }

    public void work() {
        System.out.println(empName + " is working.");
    }

    public String printStatus() {
        return empName + " (" + empId + ") is on duty.";
    }

}
