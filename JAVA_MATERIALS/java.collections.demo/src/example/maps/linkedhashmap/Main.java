package example.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);

        System.out.println(linkedHashMap); // {One=1, Two=2}

        int value = linkedHashMap.get("One");
        System.out.println(value); // 1

        linkedHashMap.remove("Two");
        System.out.println(linkedHashMap); // {One=1}

        boolean containsKey = linkedHashMap.containsKey("One");
        System.out.println(containsKey); // true

        boolean containsValue = linkedHashMap.containsValue(1);
        System.out.println(containsValue); // true
    }
}