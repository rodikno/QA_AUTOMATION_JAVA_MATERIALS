package example.lists.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add(1, "Java");

        System.out.println(arrayList); // [Hello, Java, World]

        arrayList.remove(0);
        System.out.println(arrayList); // [Java, World]

        String element = arrayList.get(1);
        System.out.println(element); // World

        arrayList.set(0, "Programming");
        System.out.println(arrayList); // [Programming, World]

        for (String value : arrayList) {
            System.out.println(value);
        }

        arrayList.forEach(value -> System.out.println(value));
        arrayList.stream().forEach(value -> System.out.println(value));


    }
}
