package com.automation.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/*
Create a set of strings (Set<String>), put into it 20 words with the letter "L".
 */

public class CollectionsTsk12 {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("L");
        str.add("Label");
        str.add("Labor");
        str.add("Lack");
        str.add("Lady");
        str.add("Lake");
        str.add("Lamp");
        str.add("Land");
        str.add("Landfill");
        str.add("Landing");
        str.add("Landlord");
        str.add("Lane");
        str.add("Language");
        str.add("Large");
        str.add("Last");
        str.add("Late");
        str.add("Later");
        str.add("Latter");
        str.add("Laugh");
        str.add("Left");

        Iterator<String> iterator = str.iterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el);
        }

    }
}
