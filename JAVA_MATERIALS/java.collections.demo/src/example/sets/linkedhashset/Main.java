package example.sets.linkedhashset;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Hello");
        linkedHashSet.add("World");
        linkedHashSet.add("Hello"); // Дублікати не допускаються

        System.out.println(linkedHashSet); // [Hello, World]

        linkedHashSet.remove("World");
        System.out.println(linkedHashSet); // [Hello]

        boolean contains = linkedHashSet.contains("Hello");
        System.out.println(contains); // true
    }
}
