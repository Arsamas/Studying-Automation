package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 2
Array of lines in reverse order
1. Create an array of 10 lines.
2. Enter 8 lines from the keyboard and store them in an array.
3. Display the contents of the entire array (10 elements) on the screen in reverse order. Each element - from a new line.
 */

public class TaskArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = new String[10];    //Create String array
        for (int i = 0; i < (arr.length-2); i++) {
            arr[i] = reader.readLine();  //Fill the array with the lines
        }
        for (int i = 0; i < (arr.length); i++) {
            System.out.println(arr[9-i]);
        }
    }
}
