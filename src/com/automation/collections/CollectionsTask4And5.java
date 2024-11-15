package com.automation.collections;
import java.util.HashMap;

/*
Task 4. Display the list of keys
There is a collection of HashMap<String, String>, there are 10 different strings.
Display the list of keys, each element with a new line.

Task 5. Display a list of values
There is a collection of HashMap<String, String>, there are 10 different strings.
Display a list of values on the screen, each element with a new line.
 */

public class CollectionsTask4And5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        map.put("key7", "value7");
        map.put("key8", "value8");
        map.put("key9", "value9");
        map.put("key10", "value10");
        //displaying keys
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
        //displaying values
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
