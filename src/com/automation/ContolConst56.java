package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 5
Enter the name and age from the keyboard. If the age is less than 18, display the message "Grow up more"
Task 6
Enter name and age from the keyboard. If the age is more than 20, display the message "18 is enough".
 */

public class ContolConst56 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) System.out.println(s + ", Grow up more");
        if (age > 20) System.out.println(s + ", 18 is enough");
    }

}

