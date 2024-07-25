package com.example.generic.wildcards;

import com.example.generic.classes.helpers.Chocolate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Chocolate> chocos = new ArrayList<>();
        // Chocolate inherits Object
        // But List<Chocolate> doesn't inherit List<Object>
//        printList(chocos);


    }



    public static void printList(List<Object> list) {
        System.out.println(list);
    }

    public static void printListOfAnything(List<?> list) {

        //Тепер List<?> може бути списком з чого завгодно (об*єктів будь якого типу)
        System.out.println(list);

    }
}
