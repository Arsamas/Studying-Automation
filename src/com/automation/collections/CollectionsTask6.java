package com.automation.collections;
import java.util.HashMap;

/*
There is a collection HashMap<String, Object>, there are 10 different pairs of objects.
Display the contents of the collection on the screen, each element on a new line.
Output example (only one string is shown here):
Sim - 5
 */

public class CollectionsTask6 {
    public static void main(String[] args) {
        HashMap<String, Objects> map = new HashMap<>();
        map.put("alpha", new Objects (1));
        map.put("beta", new Objects (2));
        map.put("gamma", new Objects (3));
        map.put("delta", new Objects (4));
        map.put("epsilon", new Objects (5));
        map.put("zeta", new Objects (6));
        map.put("eta", new Objects (7));
        map.put("theta", new Objects (8));
        map.put("iota", new Objects (9));
        map.put("kappa", new Objects (10));

        for (HashMap.Entry<String, Objects> entry : map.entrySet()) {
            String letterKey = entry.getKey();
            int letterValue = entry.getValue().getNumber();
            System.out.println(letterKey + " - " + letterValue);
        }
    }
}

class Objects {
    private int number;

    public Objects (int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}