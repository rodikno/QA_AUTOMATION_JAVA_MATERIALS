package example.lists.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.addFirst("Java");

        System.out.println(linkedList); // [Java, Hello, World]

        linkedList.removeLast();
        System.out.println(linkedList); // [Java, Hello]

        String element = linkedList.get(1);
        System.out.println(element); // Hello

        linkedList.set(0, "Programming");
        System.out.println(linkedList); // [Programming, Hello]
    }
}