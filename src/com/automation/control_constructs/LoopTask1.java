package com.automation.control_constructs;

/*
Task 8
Display the numbers from 1 to 10 using a while loop.
Task 9
Display the numbers from 10 to 1 using a while loop.
 */


public class LoopTask1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        while (b > 0) {
            System.out.print(b + " ");
            b--;
        }
    }
}
