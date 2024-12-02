package com.automation.collections;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;


/*
1. Create a list of strings.
2. Read 5 strings from the keyboard and add them to the list.
3. Using a loop, find the longest string in the list.
4. Display the found string on the screen.
5. If there are several such lines, print each line from a new line.
 */

public class CollectionsTask8 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Please, input five string: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                str.add(reader.readLine());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }


        //int x = 0;
        //Define max length of element
        /*for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() > x) {
                x = str.get(i).length();
            }
        }*/

        //Output all element with max value
        /*for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() == x) {
                System.out.println(str.get(i));
            }
        }*/

        //Define the word with maximum length
        Optional<String> maxWord = str.stream().max(Comparator.comparing((n) -> n.length()));
        //Define size of the maximum word
        if(maxWord.isPresent()) {
            //Define size of the maximum word
            int maxVal = maxWord.get().length();
            //Create stream with words
            Stream<String> maxStr = str.stream().filter((n) -> n.length() == maxVal);
            //Output stream
            maxStr.forEach(System.out::println);
        }
    }
}
