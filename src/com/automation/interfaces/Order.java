package com.automation.interfaces;

public class Order {
    private PaymentMethod paymentMethod;

    public Order (PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        paymentMethod.processPayment(amount);
    }

    public boolean checkPaymentStatus() {
        return paymentMethod.checkStatus();
    }

    public void cancelOrder() {
        paymentMethod.cancelPayment();
    }
}

