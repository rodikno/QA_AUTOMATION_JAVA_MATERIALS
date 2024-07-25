package com.example.generic.classes;


import com.example.generic.classes.helpers.Candy;
import com.example.generic.classes.helpers.SweetThing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Delayed;

// This one should have a type parameter
public class BoxOfSweetThings<T> {
    private ArrayList<T> content = new ArrayList<>();

    public void addToTheBox(T thing) {
        this.content.add(thing);
    }


    public void printAllSweetiesFromTheBox() {
        System.out.println("Here are the sweeties from this box:");
        content.forEach(sweetie -> System.out.println(sweetie));
        System.out.println("====================================");
    }

}
