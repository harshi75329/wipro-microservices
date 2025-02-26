package com.wipro.java.ms.o;

public class Payment {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentMethod creditCard = new CreditCard();
        paymentMethod paypal = new PayPal();

        paymentService.processPayment(creditCard, 100.0);
        paymentService.processPayment(paypal, 200.0);
    }
}
