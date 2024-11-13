package com.automation.interfaces;

/*
Задача на интерфейсы: Система для оплаты заказов разными способами
Описание задачи: Создайте систему для оплаты заказов, где у пользователя есть несколько вариантов оплаты: кредитная карта,
PayPal, и Google Pay. Каждый из этих способов оплаты требует разной логики для выполнения транзакции, но все они должны иметь общий
набор методов: обработка платежа, проверка статуса и отмена транзакции.
Подсказки для реализации:
Создайте интерфейс PaymentMethod:
Объявите методы:
void processPayment(double amount): метод для обработки платежа на указанную сумму.
boolean checkStatus(): метод для проверки статуса платежа.
void cancelPayment(): метод для отмены платежа.
Создайте классы CreditCardPayment, PayPalPayment, и GooglePayPayment, реализующие интерфейс PaymentMethod:
CreditCardPayment: Реализуйте метод processPayment, добавив логику для обработки платежа с использованием номера кредитной карты.
PayPalPayment: Реализуйте метод processPayment, добавив логику для обработки платежа через PayPal (например, с помощью адреса электронной почты).
GooglePayPayment: Реализуйте метод processPayment, добавив логику для обработки платежа через Google Pay.
Создайте класс Order, который принимает объект типа PaymentMethod:
Метод makePayment(double amount): принимает объект PaymentMethod и вызывает processPayment для обработки платежа.
Метод checkPaymentStatus(): вызывает метод checkStatus выбранного способа оплаты.
Метод cancelOrder(): вызывает cancelPayment для отмены транзакции.
Пример использования:
В методе main создайте экземпляры CreditCardPayment, PayPalPayment, или GooglePayPayment, и передайте их в Order, чтобы выполнить действия.
Этот подход позволяет гибко использовать разные способы оплаты с помощью интерфейса PaymentMethod без привязки к конкретной реализации.
 */

public class Main {
    public static void main(String[] args) {
        //Create Credit Card Payment object
        PaymentMethod creditCard = new CreditCardPayment( "0000 0000 0000 0000");
        //Create PayPal Payment object
        PaymentMethod payPalPayment = new PayPalPayment("qa@qatest.com");
        //Create Google Pay object
        PaymentMethod googlePayPayment = new GooglePayPayment();
        //Create Orders object for each types of Payment
        Order order1 = new Order(creditCard);
        Order order2 = new Order(payPalPayment);
        Order order3 = new Order(googlePayPayment);

        order1.checkPaymentStatus();
        order1.makePayment(1000);
        order1.cancelOrder();

        System.out.println();

        order2.checkPaymentStatus();
        order2.makePayment(1000);
        order2.cancelOrder();

        System.out.println();

        order3.checkPaymentStatus();
        order3.makePayment(1000);
        order3.cancelOrder();
    }
}