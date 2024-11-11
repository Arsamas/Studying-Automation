package com.automation.collections;
import java.util.ArrayList;
import java.util.Iterator;

/*
1. Create a list of lines.
2. Add 5 different lines to it.
3. Display its size on the screen.
4. Using a loop, display its contents on the screen, each value on a new line
 */

public class CollectionsTask7 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("One");
        str.add("Two");
        str.add("Three");
        str.add("Four");
        str.add("Five");

        Iterator <String> iterator = str.iterator();

        while (iterator.hasNext()) {
            String text = iterator.next();
            //Outputting the length of the strings
            System.out.println(text.length());
        }
        //Outputting contents using loop, each string in a new line
        for (String el : str) System.out.println(el);
    }
}
