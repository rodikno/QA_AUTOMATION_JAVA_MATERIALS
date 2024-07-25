package example.lists.comparison;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long startTime;
        long endTime;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

//        //Warm up the JVM by doing the operation a number of times
//        for (int i = 0; i < 100_000; i++) {
//            arrayList.get(0);
//            linkedList.get(0);
//        }

        //***** ArrayList ********
        startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(1_000_000, 99);
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList:\t" + ((endTime - startTime)) + "ns");


        //******* LinkedLIst ******
        startTime = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(1_000_000, 99);
        }

        endTime = System.nanoTime();
        System.out.println("LinkedList:\t" + ((endTime - startTime)) + "ns");
    }
}