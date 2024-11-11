package com.automation.collections;
import java.util.HashMap;

/*
There is a Cat class, with a name field (name, String).
Create a collection HashMap<String, Cat>.
Add 10 cats to the collection, use cat name as a key.
Print the result on the screen, each item on a new line.
 */

public class CollectionsTask3 {
    public static void main(String[] args) {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Poppy", new Cat("Poopy"));
        map.put("Molly", new Cat("Molly"));
        map.put("Luna", new Cat("Luna"));
        map.put("Bella", new Cat("Bella"));
        map.put("Daisy", new Cat("Daisy"));
        map.put("Millie", new Cat("Millie"));
        map.put("Rosie", new Cat("Rosie"));
        map.put("Tilly", new Cat("Tilly"));
        map.put("Willow", new Cat("Willow"));
        map.put("Lilly", new Cat("Lilly"));

        for (HashMap.Entry<String, Cat> entry : map.entrySet()) {
            String catKey = entry.getKey();
            String catValue = entry.getValue().getCat();
            System.out.println(catKey + " = " + catValue);
        }
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getCat() {
        return name;
    }

}
