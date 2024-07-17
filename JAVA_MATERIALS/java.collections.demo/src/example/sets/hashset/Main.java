package example.sets.hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Hello"); // Дублікати не допускаються

        System.out.println(hashSet); // [World, Hello]

        hashSet.remove("World");
        System.out.println(hashSet); // [Hello]

        boolean contains = hashSet.contains("Hello");
        System.out.println(contains); // true
    }
}