// File: Customer.java
package restaurant;

public class Customer {
    public String custName;
    public String phoneNumber;
    public String email;

    public Customer(String name, String phone, String mail) {
        custName = name;
        phoneNumber = phone;
        email = mail;
    }

    public String getCustomerInfo() {
        return custName + ", " + phoneNumber + ", " + email;
    }

}
