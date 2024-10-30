package com.automation.primitive;
import java.util.Scanner;
import com.welcome.*;

/*
Additional task:

Create another Main2 class with a main(String[] args) method that, when run, outputs "Hello, world!" to the console.
Create a separate package 'com.welcome'.
Create a Hello class in it and add methods to it:
- setupName(String name) - assigns the person's name to an internal private variable,
- welcome() - forms and outputs the greeting "Hello, %name%" (the name must be substituted), byeBay() - says
goodbye and outputs the phrase "Bye, %name%" to the console
In Main2 class connect this package, and at the beginning of the program:
- ask for the person's name,
- assign it to the Hello class variable,
- then greet them,
- and at the end say goodbye before closing the program.
 Between 'hello' and 'bye' will be your "Hello, world!".
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();

        Hello greeting = new Hello();
        greeting.setupName(name);
        greeting.welcome();
        System.out.println("Hello, world!");
        greeting.byeBay();
    }
}
