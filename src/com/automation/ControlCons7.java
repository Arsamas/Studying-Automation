package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

/*
Task 7
For seven attempts to guess a number. At each attempt you will see a message - "Little" or "Much". If you guess
within seven attempts, the message "Guessed :)" will be displayed and the program will terminate. If after 7 attempts
the number is not guessed, the message "Did not guess :(" is displayed and the program terminates.
(You use a code to generate the secret number:
Random random = new Random();
int secret;
// Generate a number from 0 to 20
secret = random.nextInt(20 + 1);
 */

public class ControlCons7 {
    public static void main(String[] args) throws IOException {
        int secret;
        boolean flag = false;
        Random random = new Random();
        secret = random.nextInt(0, 20);
        System.out.println(secret);//Create random number from 0 to 20
        for (int i = 0; i < 7; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());  //User input its number
            if (a == secret) {
                flag = true;
                break;
            } else if (a < secret) {
                System.out.println("Much");
            } else {
                System.out.println("Little");
            }
        }
        if (flag) {
            System.out.println("Guessed :)");
        } else {
            System.out.println("Did not guess :(");
        }
    }
}
