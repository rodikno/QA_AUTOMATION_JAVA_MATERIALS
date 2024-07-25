package com.example.generic.classes;

import com.example.generic.classes.helpers.Bun;

import java.util.ArrayList;

public class BoxOfBuns {
    ArrayList<Object> content = new ArrayList<>();

    public void addBun(Object bun) {
        this.content.add(bun);
    }

}
