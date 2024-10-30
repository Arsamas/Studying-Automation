package com.automation.control_constructs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 10
Enter a string and the number N from the keyboard.
Print the string N times using a while loop.
Example input:
abc
2
Example output:
abv
abc
 */

public class LoopTask2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        while (num > 0) {
            System.out.println(s1);
            num--;
        }
    }
}
