package com.automation.control_constructs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 16
Using the for loop, print to the screen:
- horizontal line of 10 eights
- a vertical line of 10 eights.
Task 17
Enter a name from the keyboard and, using the for loop 10 times, output: [*name* loves me.]
Text example:
Anna loves me.
…
Task 18
Write a program that counts down from 30 to 0, and at the end displays the text "Boom!". The program must decrease the number 10 times per
second. To insert a delay into the program, use the function:
Thread.sleep(100); //delay for one tenth of a second.
Example:
30
29
…
1
0
Boom!
 */

public class ForLoopTask2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Task 16
        for (int i= 0; i < 20; i++) {
            if ( i < 9 ) {
                System.out.print("8");
            }
            else {
                System.out.println("8");
            }
        }
        System.out.println();

        //Task 17
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for ( int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }
        System.out.println();
        //Task 18
        for (int j = 30; j > 0; j--) {
            System.out.print(j);
            Thread.sleep(100);    // Time out - 1 milisec
            System.out.print("\b\b");  //Deleting the printed number (two symbols)
        }
        System.out.print("Boom!");
    }
}
