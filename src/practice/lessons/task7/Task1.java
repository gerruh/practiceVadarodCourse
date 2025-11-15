package practice.lessons.task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Map<Integer, String> entry = new HashMap<>();
        entry.put(3, "string2");
        entry.put(4, "string3");
        entry.put(5, "string5");
        entry.put(6, "string4");
        entry.put(7, "string5");

        Set<Integer> keys = entry.keySet();
        Integer var = 1;
        for (Integer i : keys) {
            if (i > 5) {
                System.out.println(entry.get(i));
            }
            if (i == 0) {
                System.out.println(entry.values());
            }
            String val = entry.get(i);
            if (val.length() >5) {
                    var = i * var;
            System.out.println(var);
        }
    }
    }
}
