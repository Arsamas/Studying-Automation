package com.automation.collections;
import java.util.HashSet;
import java.util.Iterator;

/*
Create a HashSet collection with element type String.
Add 10 strings to it: watermelon, banana, cherry, pear, melon, blackberry, shen-hen, strawberry, iris, potato.
Display the contents of the collection on the screen, each item on a new line.
See how the order of the added items has changed.
 */

public class CollectionsTask1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("melon");
        set.add("blackberry");
        set.add("mulberry");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");

        Iterator<String> iterator = set.iterator();  //Создаем итератор

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        //set.forEach(el -> System.out.println(el));

    }
}
