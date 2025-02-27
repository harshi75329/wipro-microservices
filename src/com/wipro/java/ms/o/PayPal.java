package com.wipro.java.ms.o;

public class PayPal implements paymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
