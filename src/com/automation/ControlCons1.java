package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 1
Enter two numbers from the keyboard and display the minimum of them.
Task 2
Input four numbers from the keyboard, and display the maximum of them.
Task 3
Enter three numbers from the keyboard and display them in descending order.
 */

    public class ControlCons1 {
        public static void main(String[] args) throws IOException {
            //Task 1
            minimumNumber();
            //Task 2
            maximumFour();
            //Task 3
            descenderOrder();
    }

    static void minimumNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(a < b ? a : b);
    }

    static void maximumFour() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        if (a < b & c < d) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b < d) {
            System.out.println(b);
        } else  System.out.println(d);
    }

        static void descenderOrder() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());

            if (a > b & a > c) {
                if (b > c) {
                    System.out.print(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else if (b > c) {
                System.out.println(b + " " + c + " " + a);
            } else  System.out.println(c + " " + b + " " + a);
        }
}
