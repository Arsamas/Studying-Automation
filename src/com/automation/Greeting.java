package com.automation;
import java.util.Scanner;

/*
Task 1
Create a simple Java project (console application) that prints "Hello, world!" to the console when started.
Add a method printHelloName(), which will ask the user to enter a name, read the entered name from the console
and display the greeting "Hello, %name%".
 */

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        printHelloName();
    }

    static void printHelloName() {
        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
    }

    static void printName() {
        System.out.println("Please enter your full name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hi, " + name);
    }
}
