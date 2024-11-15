package com.automation.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Iterator;

/*
Create a set of numbers (Set<Integer>), put 20 different numbers in it.

Remove all numbers greater than 10 from the set.
 */

public class CollectionsTask13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> str = new HashSet<>();
        int num;
        System.out.println("Set before removing elements greater than 10");
        for (int i = 0; i < 20; i++) {
            num = rand.nextInt(20);
            str.add(num);
        }

        for (Integer el : str) System.out.print(el + " ");

        Iterator<Integer> iterator = str.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
            if (el > 10) iterator.remove();
        }
        System.out.println();
        System.out.println("Set after removing elements greater than 10");

        for (Integer el : str) System.out.print(el + " ");

    }
}
