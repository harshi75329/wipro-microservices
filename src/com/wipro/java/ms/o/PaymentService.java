package com.wipro.java.ms.o;

public class PaymentService {
    public void processPayment(paymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
