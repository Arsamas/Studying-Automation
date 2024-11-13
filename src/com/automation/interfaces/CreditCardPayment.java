package com.automation.interfaces;

public class CreditCardPayment implements PaymentMethod {
    private boolean flag = true;
    private String cardNumber;

    public CreditCardPayment (String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        if (flag) {
            System.out.println("Credit Card Payment transfer of " + amount + " to the card " + getCardNumber() + " was successful");
        }
    }

    @Override
    public boolean checkStatus() {
        System.out.println("Credit Card Payment transfer is checked");
        return flag;
    }

    @Override
    public void cancelPayment() {
        if (!flag) {
            System.out.println("Credit Card Payment transfer is canceled");
        }
    }
}
