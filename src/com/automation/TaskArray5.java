package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/*
Task 5
One large array and two small arrays
1. Create an array for 20 numbers.
2. Enter values into it from the keyboard.
3. Create two arrays of 10 numbers each.
4. Copy the large array into two small arrays: half of the numbers into the first small
array, the other half into the second small array.
5. Display the second small array on the screen, each value on a new line.
 */

public class TaskArray5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrNum = new int[20];        //Create main array
        for (int i = 0; i < arrNum.length; i++) {
            String s = reader.readLine();   //Get number from user
            arrNum[i] = Integer.parseInt(s); //Fill the main array
        }
        int[] arrSmall1 = Arrays.copyOfRange(arrNum, 0, (arrNum.length / 2));
        int[] arrSmall2 = Arrays.copyOfRange(arrNum, (arrNum.length / 2), arrNum.length);

        for( int i = 0; i<arrSmall2.length;i++)    {
        System.out.println(arrSmall2[i]); //Fill the main array
     }

        System.out.println("Hello World");
   }
}
