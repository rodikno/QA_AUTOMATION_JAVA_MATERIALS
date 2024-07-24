package com.example.generic.classes;

import com.example.generic.classes.helpers.Chocolate;

import java.util.ArrayList;


public class BoxOfChocolates {
    ArrayList<Chocolate> content = new ArrayList<>();


    public void addChocolate(Chocolate choco) {
        this.content.add(choco);
    }
}
