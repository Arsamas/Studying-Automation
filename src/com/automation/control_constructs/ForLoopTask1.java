package com.automation.control_constructs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 13
Using the for loop, display even numbers from 1 to 100 inclusive.
Use a space or a new line.
Task 14
Enter two numbers m and n from the keyboard.
Use the for loop to display a rectangle of size m by n made of eights.
Example: m=2, n=4
8888
8888
Task 15
Using a for loop, display a right triangle of eights with sides 10 and 10.
Example:
8
88
888
 */

public class ForLoopTask1 {
    public static void main(String[] args) throws IOException {
        //output even numbers from 1 to 100
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 ) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        //Output rectangle Task 14
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Enter amount of rows
        int m = Integer.parseInt(reader.readLine());
        //Enter amount of columns
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        //Output right triangle with sides 10 and 10.
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
