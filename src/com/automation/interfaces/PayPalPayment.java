package com.automation.interfaces;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private boolean flag = true;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public void processPayment(double amount) {
        if (flag) {
            System.out.println("PayPal Payment Transfer of " + amount + " to the account " + getEmail() + " was successful");
        }
    }

    @Override
    public boolean checkStatus() {
        System.out.println("PayPal Payment transfer is checked");
        return flag;
    }

    @Override
    public void cancelPayment() {
        if (!flag) {
            System.out.println("PayPal Payment is canceled");
        }
    }
}
