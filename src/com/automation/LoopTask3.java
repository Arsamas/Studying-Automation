package com.automation;

/*
Task 11
Display a 10x10 square of letters S using a while loop.
Do not separate letters in each line.
Task 12
Display a 10x10 multiplication table using a while loop.
Separate the numbers with a space.
Example output:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
 */

public class LoopTask3 {
    public static void main(String[] args) {
        //Task 11
        int c = 0;
        int i = 0;
        int b = 0;
        while (c < 10) {
            System.out.print("S");
            c++;
        }
        System.out.println();
        while (i < 8) {
            int d = 0;
            System.out.print("S");
            while (d < 8) {
                System.out.print(" ");
                d++;
            }
            i++;
            System.out.println("S");
        }
        while (b < 10) {
            System.out.print("S");
            b++;
        }
        System.out.println();
        System.out.println();

        int z = 0;
        while( z < 10) {
            int m = 0;
            while ( m < 10) {
                System.out.print("S");
                m++;
            }
            System.out.println();
            z++;
        }
        System.out.println();
        System.out.println();
        //Task 12
        int j = 1;
        while (j < 10) {
            int y = 1;
                while ( y <= 10 ) {
                    System.out.print((j*y) + " ");
                    y++;
                }
            System.out.println();
            j++;
        }
    }
}
