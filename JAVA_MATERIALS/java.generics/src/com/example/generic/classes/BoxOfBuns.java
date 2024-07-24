package com.example.generic.classes;

import com.example.generic.classes.helpers.Bun;

import java.util.ArrayList;

public class BoxOfBuns {
    ArrayList<Bun> content = new ArrayList<>();

    public void addBun(Bun bun) {
        this.content.add(bun);
    }

}
