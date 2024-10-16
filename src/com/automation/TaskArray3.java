package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 3
2 arrays
1. Create an array with 10 rows.
2. Create an array for 10 numbers.
3. Enter 10 strings from the keyboard, fill the array of strings with them.
4. In each cell of the array of numbers, write the length of the string from the array of strings whose index/cell
number matches the current index from the array of numbers.
5. Display the contents of the number array on the screen, with each value displayed on a new line.
 */

public class TaskArray3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[10];    //Create String array with 10 rows
        int[] arrNum = new int[10];           //Create array with 10 numbers
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = reader.readLine();  //Fill arrStr with the lines
            arrNum[i] = arrStr[i].length();  //Fill arrNum with the numbers
        }
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrNum[i] + " " + arrStr[i]); //Display numbers with lines
        }
    }
}