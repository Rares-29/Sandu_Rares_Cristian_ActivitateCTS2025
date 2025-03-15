// File: Feedback.java
package restaurant.payment;

import restaurant.Customer;

public class Feedback {
    public Customer customer;
    public int rating; // scale 1-5
    public String comment;

    public Feedback(Customer cust, int rate, String comm) {
        customer = cust;
        rating = rate;
        comment = comm;
    }

    // Messy: method with duplicated print statements
    public void printFeedback() {
        System.out.println("Feedback from " + customer.custName);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Comment: " + comment);
        System.out.println("Thank you for your feedback!");
    }

    public void showFeedback() {
        printFeedback();
    }

    // Extra method for detailed feedback display
    public void detailedFeedback() {
        System.out.println("----- Detailed Feedback -----");
        printFeedback();
        System.out.println("-----------------------------");
    }

    // Dummy method with no purpose
    public void dummyFeedbackMethod() {
        // Intentionally blank
    }
}
