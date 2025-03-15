package restaurant.employee;

import java.util.List;

public class EmployeeWorker {
    List<Employee> employees;

    public EmployeeWorker(List<Employee> employees) {
        this.employees = employees;
    }

    public void work() {
        for (Employee emp : employees) {
            if(emp instanceof Waiter) {
                System.out.println("Waiter " + emp.empName + " is busy serving.");
            } else if(emp instanceof Chef) {
                System.out.println("Chef " + emp.empName + " is busy cooking.");
            } else {
                System.out.println("Employee " + emp.empName + " is doing miscellaneous tasks.");
            }
        }
    }
}
