package com.automation.collections;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/*
1. Create a list of strings.
2. Add 5 lines to it from the keyboard.
3. Delete the last line and insert it at the beginning. Repeat 13 times.
4. Using a loop, display the contents on the screen, each value on a new line
5. DON'T USE METHOD FROM LinkedList
 */

public class CollectionsTask11 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Input five string into the ArrayList:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Input string into the ArrayList
            for (int i = 0; i < 5 ; i ++) {
                str.add(reader.readLine());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }

        String string;
        int size = str.size();
        for (int j = 0; j < 13; j ++) {
            //Remove the las element
            string = str.get(size - 1);
            str.remove(size - 1);
            //Add last element in the beginning
            str.add(0, string);
        }

        for (String el : str) System.out.println(el);
    }
}
