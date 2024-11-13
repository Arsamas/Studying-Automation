package com.automation.interfaces;

interface PaymentMethod {
    void processPayment(double amount);
    boolean checkStatus();
    void cancelPayment();
}
