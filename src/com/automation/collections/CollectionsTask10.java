package com.automation.collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/*
1. Create a list of strings in the main method.
2. Add 10 lines to it from the keyboard, but only add not to the end of the list, but to the beginning.
3. Using a loop, print the contents to the screen, each value on a new line.
 */

public class CollectionsTask10 {
    public static void main(String[] args) throws IOException{
        System.out.println("Input ten string into the ArrayList:");
        ArrayList<String> str = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Fill ArrayList with elements, adding in the beginning of the list
            for (int i = 0; i < 10; i++) {
                str.add(0, reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
        //output elements of the list
        for (String el : str) {
            System.out.println(el);
        }
    }
}
