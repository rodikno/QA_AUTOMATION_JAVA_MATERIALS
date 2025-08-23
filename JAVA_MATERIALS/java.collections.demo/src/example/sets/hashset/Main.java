package example.sets.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> typesOfCoffee = new HashSet<>();

        typesOfCoffee.add("Latte");

        TreeSet<String> coffeeTypes = new TreeSet<>();
        System.out.println("DEBUG");




//
//        HashSet<String> hashSet = new HashSet<>();
//
//        hashSet.add("Hello");
//        hashSet.add("World");
//        hashSet.add("Hello"); // Дублікати можна додавати - але в множині залишиться тільки "one of a kind"
//
//        System.out.println(hashSet); // [World, Hello]
//
//        hashSet.remove("World");
//        System.out.println(hashSet); // [Hello]
//
//        boolean contains = hashSet.contains("Hello");
//        System.out.println(contains); // true
    }
}