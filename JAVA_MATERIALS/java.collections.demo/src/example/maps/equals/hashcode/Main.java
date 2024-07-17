package example.maps.equals.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> personMap = new HashMap<>();

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);

        personMap.put(p1, "Engineer");
        personMap.put(p2, "Doctor");

        System.out.println(personMap.get(p1)); // Engineer
        System.out.println(personMap.get(p2)); // Doctor

        // Створимо новий об'єкт з тими ж значеннями
        Person p3 = new Person("Alice", 30);
        System.out.println(personMap.get(p3)); // Engineer, оскільки p1 і p3 рівні
    }
}
