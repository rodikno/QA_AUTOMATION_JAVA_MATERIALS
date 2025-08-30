package com.example.generic.classes;


import java.util.ArrayList;

// This one should have a type parameter
public class BoxOfSweetThings<T> {
    private final ArrayList<T> content = new ArrayList<>();

    public void addToTheBox(T thing) {
        this.content.add(thing);
    }


    public void printAllSweetiesFromTheBox() {
        System.out.println("Here are the sweeties from this box:");
        content.forEach(sweetie -> System.out.println(sweetie));
        System.out.println("====================================");
    }

}
