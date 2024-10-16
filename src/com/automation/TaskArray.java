package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 1
1. In the initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Read 20 numbers from the console and fill the array with them
2. The max(int[] array) method should find the maximum number from the array elements
 */

public class TaskArray {
    public static void main(String[] args) throws IOException {
        max(initializeArray()); //Method finds a maximum number in the array

    }

     static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];    //Create array
        for (int i = 0; i < arr.length; i++) {
            String s = reader.readLine();   //Get number from user
            arr[i] = Integer.parseInt(s);  //Fill the array with the number
        }
        return arr;
    }

    static void max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {          //Found the maximum number
                max = arr[i];
            }
        }
        System.out.println(max); //Output maximum number
    }

}
