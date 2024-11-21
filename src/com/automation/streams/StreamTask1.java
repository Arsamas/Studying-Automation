package com.automation.streams;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

/*
Create a List<String> list not shorter than 50 elements of different length (filling is not important).
Add manually some empty elements ""
Output to the console using stream():
the length of each of the list elements.
non-empty list items not containing the d character
list items in alphabetical order.
 */

public class StreamTask1 {
    public static void main(String[] args) {
        //Create Array with the more than 50 elements
        String str[] = new String[]
        {"lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor",
         "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua", "ut", "enim", "ad", "minim", "veniam", "quis",
         "nostrud", "exercitation", "ullamco", "laboris", "nisi", "ut", "aliquip", "ex", "ea", "commodo", "consequat",
         "duis", "aute", "irure", "dolor", "in", "reprehenderit", "in", "voluptate", "velit", "esse", "cillum", "dolore",
         "eu", "fugiat", "nulla", "pariatur", "excepteur", "sint", "occaecat", "cupidatat", "non", "proident", "sunt", "in",
         "culpa", "qui", "officia", "deserunt", "mollit", "anim", "id", "est", "laborum"
        };
        //Fill List by the values
        List<String> list = new ArrayList<>(Arrays.asList(str));
        //Add empty elements
        list.add("");
        list.add(10, "");
        list.add(20, "");
        list.add(0, "");

        //Output length of words
        Stream<Integer> wordsLength = list.stream().map((n) -> n.length());
        wordsLength.forEach(el -> System.out.print(" " + el));

        System.out.println();

        //non-empty list items not containing the d character
        Stream<String> newList = list.stream()
                .filter((n) -> !n.isEmpty())
                .filter((n) -> !n.contains("d"));
        newList.forEach(el -> System.out.print(" " + el));

        System.out.println();

        //list items in alphabetical order
        Stream<String> alphaBet = list.stream().sorted();
        alphaBet.forEach(el -> System.out.print(" " + el));

    }
}
