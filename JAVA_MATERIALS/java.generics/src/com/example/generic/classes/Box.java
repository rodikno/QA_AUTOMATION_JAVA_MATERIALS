package com.example.generic.classes;


import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;

// This one should have a type parameter
public class Box<T> {
    private ArrayList<T> content = new ArrayList<>();

    public void addSweetieToTheBox(T sweetThing) {
        this.content.add(sweetThing);
    }

    public void printAllSweetiesFromTheBox() {
        System.out.println("Here are the sweeties from this box:");
        content.forEach(sweetie -> System.out.println(sweetie));
        System.out.println("====================================");
    }

}
