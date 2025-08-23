package example.sets.linkedhashset;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Hello");
        linkedHashSet.add("World");
        linkedHashSet.add("Hello"); // Дублікати не допускаються

        if (linkedHashSet.isEmpty()) {
            System.out.println("LinkedHashSet is empty");
        } else {
            linkedHashSet.forEach(elem -> linkedHashSet.remove(elem));
        }

    }
}
