package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 4
Array of numbers in reverse order
1. Create an array of 10 numbers.
2. Enter 10 numbers from the keyboard and write them into the array.
3. Arrange the elements of the array in reverse order.
4. Display the result on the screen, each value on a new line.
 */

public class TaskArray4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrNum = new int[10];  //Create main array
        int[] newArrNum = new int[10];  // Create auxiliary array
        for (int i = 0; i < arrNum.length; i++) {
            String s = reader.readLine();   //Get number from user
            arrNum[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < arrNum.length; i++) {
            newArrNum[i] = arrNum[9 - i];             //Fill Auxiliary array with the reverse values
        }
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = newArrNum[i];                  //Fill main array with new values
        }

        System.out.println();
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);            //Display the array: each value on a new line
        }
    }
}
