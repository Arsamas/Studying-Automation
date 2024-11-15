package com.automation.interfaces;

public class GooglePayPayment implements PaymentMethod {
    private boolean flag = false;

    @Override
    public void processPayment(double amount) {
        if (flag) {
            System.out.println("Google Pay Payment Transfer of " + amount + " was successful");
        }
    }

    @Override
    public boolean checkStatus() {
        System.out.println("Google Pay Payment transfer is checked");
        return flag;
    }

    @Override
    public void cancelPayment() {
        if (!flag) {
            System.out.println("Google Pay Payment has been canceled");
        }
    }
}
