package com.example.generic.classes;

import com.example.generic.classes.helpers.Candy;

import java.util.ArrayList;

public class BoxOfCandy {
    ArrayList<Candy> content = new ArrayList<>();


    public void addCandy(Candy candy) {
        this.content.add(candy);
    }
}
