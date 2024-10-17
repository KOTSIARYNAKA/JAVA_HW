package HW_14Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer,
                String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four-Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight-Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        //  System.out.println(map.keySet());
        //System.out.println(map.values());
        //  for (map.get(0); System.out.println(map.values()));

        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }
        if (map.containsKey(0)) {
            String result = String.join(", ", map.values());
            System.out.println(result);
        }

        int a = 1;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().toString().length() > 5) {
                a = ((Integer) entry.getKey()) * a;
            }

        }
        System.out.println(a);


    }
}

