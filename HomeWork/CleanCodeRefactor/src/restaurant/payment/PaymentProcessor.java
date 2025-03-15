// File: PaymentProcessor.java
package restaurant.payment;

import restaurant.payment.Bill;

public class PaymentProcessor {

    // Messy: process payment with duplicated if conditions
    public void processPayment(Bill bill, String method) {
        System.out.println("Processing payment using " + method);

        if(method.equalsIgnoreCase("credit")) {
            System.out.println("Processing credit card payment for amount $" + bill.totalAmount);
        } else if(method.equalsIgnoreCase("debit")) {
            System.out.println("Processing debit card payment for amount $" + bill.totalAmount);
        } else if(method.equalsIgnoreCase("cash")) {
            System.out.println("Processing cash payment for amount $" + bill.totalAmount);
        } else {
            System.out.println("Unknown payment method. Defaulting to cash for $" + bill.totalAmount);
        }
        // Duplicate check for unknown method
        if(!method.equalsIgnoreCase("credit") && !method.equalsIgnoreCase("debit") && !method.equalsIgnoreCase("cash")) {
            System.out.println("Payment method not recognized. Payment processed as cash.");
        }
    }

    // Messy: redundant method for refund processing
    public void processRefund(Bill bill, String method) {
        System.out.println("Processing refund using " + method + " for amount $" + bill.totalAmount);
    }

    // Extra dummy method
    public void dummyPaymentMethod() {
        // does nothing
    }
}
