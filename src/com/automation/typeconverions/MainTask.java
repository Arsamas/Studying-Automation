package com.automation.typeconverions;

/*
Task 1
Two natural numbers are stored in the variables q and w. Create a program that displays
the result of dividing q by w with a remainder. Example of the program output (for the case when q
stores 21 and w stores 8): 21 / 8 = 2 and 5 in the remainder

Task 2
The variable n stores a natural two-digit number. Create a program that calculates and
displays the sum of digits of n.

Task 3
A real number with a non-zero fractional part is stored in the variable n. Create a program
that rounds the number n to the nearest integer and displays the result on the screen.

Task 4
Given three variables a, b and c. Change the values of these variables so that a stores the value of a+b,
b stores the difference of the old values of c-a, and c stores the sum of the old values of a+b+c.
For example, a=0, b=2, c=5, then the new values are a=2, b=5 and c=7.
 */

public class MainTask {
    public static void main(String[] args) {
        byte q = 21;
        byte w = 8;
        float n = 129.921f;
        byte a = 0;
        byte b = 2;
        byte c = 5;
        Task1( q,  w);
        Task2( q,  w);
        Task3(n);

        a = (byte) (a + b);
        b = (byte) (c - a + b);
        c = (byte) (a + c);

        System.out.print(" a = " + a);
        System.out.print(" b = " + b);
        System.out.println(" c = " + c);


    }

    static void Task1(short q, short w) {
        int result = q / w;
        int reminder = q % w;
        System.out.println("Result of dividing: " + result + " Reminder: " + reminder);
    }


    static void Task2(short q, short w) {
        int result = q + w;
        System.out.println("The sum is: " + result);
    }

    static void Task3(float n) {
        int result = (int) n;
        System.out.println("The variable is rounded: " + result);
    }


}