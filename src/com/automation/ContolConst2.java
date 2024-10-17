package com.automation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Task 4
Enter two names from the keyboard, and if the names are the same, display the message
"The names are identical". If the names are different but their lengths are equal, display the message
"The lengths of the names are equal".
 */

public class ContolConst2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        if (s1.equals(s2)) {
            System.out.println("The names are identical");
        } else if (s1.length() == s2.length()) {
            System.out.println("The lengths of the names are equal");
        }

    }
}
