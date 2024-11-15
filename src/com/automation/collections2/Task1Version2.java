package com.automation.collections2;

import java.util.HashMap;
import java.util.Map;

public class Task1Version2 {
    public static void main(String[] args) {
        //We input the string
        String str = "Java is a programming language. Java is used for many applications.";

        System.out.println(convertString(str));
    }

    public static Map<String, Integer> convertString(String str) {
        Map<String, Integer> map = new HashMap<>();
        //Put all words in a low case
        String string = str.toLowerCase();
        //Pattern to delete ,/./space from array
        String regex = "[\\,. ]+";
        //Split String to separate elements using pattern conditions
        String[] list = string.split(regex);

        for (String el : list) {
        //Count the number of occurrences of each word
        map.put(el, map.getOrDefault(el, 0) + 1);
        }
        // Remove words that appear only once
        map.entrySet().removeIf(entry -> entry.getValue() == 1);

        return map;
    }
}
