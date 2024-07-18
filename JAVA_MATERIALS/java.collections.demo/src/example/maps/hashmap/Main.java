package example.maps.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);

        System.out.println(hashMap); // {One=1, Two=2}

        int someValue = hashMap.get("One");
        System.out.println(someValue); // 1

        hashMap.remove("Two");
        System.out.println(hashMap); // {One=1}

        boolean containsKey = hashMap.containsKey("One");
        System.out.println(containsKey); // true

        boolean containsValue = hashMap.containsValue(1);
        System.out.println(containsValue); // true

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        hashMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}