package com.automation.collections;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/*
1. Create a list of strings.
2. Read 5 strings from the keyboard and add them to the list.
3. Using a loop, find the shortest string in the list.
4. Display the found string on the screen.
5. If there are several such lines, print each line from a new line
 */

public class CollectionsTask9 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strArr = new ArrayList<>();
        System.out.println("Please, input five string: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Read five string from console
            for (int i = 0; i < 5; i++) {
                strArr.add(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }

        //Find the shortest length of string
        int min = strArr.get(0).length();
        for (int j = 1; j < strArr.size(); j++) {
            if (strArr.get(j).length() < min) min = strArr.get(j).length();
        }
        //Output strings with the shortest length
        for (int j = 0; j < strArr.size(); j++) {
            if (strArr.get(j).length() == min) System.out.println(strArr.get(j));
        }
    }
}
