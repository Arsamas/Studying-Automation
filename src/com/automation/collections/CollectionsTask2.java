package com.automation.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a collection HashMap<String, String>, put there 10 pairs of strings: watermelon - berry,
banana - herb, cherry - berry, pear - fruit, melon - vegetable, blackberry - bush, ginseng - root,
strawberry - berry, iris - flower, potato - tuber.
Display the contents of the collection on the screen, each item on a new line.
Output examlpe (only one line is shown here):
potato - tuber
 */

public class CollectionsTask2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("watermelon ", "berry");
        map.put("banana", "herb");
        map.put("cherry", "berry");
        map.put("pear", "fruit");
        map.put("melon", "vegetable");
        map.put("blackberry", "bush");
        map.put("ginseng", "root");
        map.put("strawberry", "berry");
        map.put("iris", "flower");
        map.put("potato", "tuber");
        //Для Map с использованием entrySet()
       Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

       while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }


    }
}
