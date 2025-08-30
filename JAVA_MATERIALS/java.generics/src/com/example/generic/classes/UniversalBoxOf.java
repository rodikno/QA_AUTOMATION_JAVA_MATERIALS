package com.example.generic.classes;

import java.util.ArrayList;

public class UniversalBoxOf<T> {

    ArrayList<T> content = new ArrayList<>();


    public void add(T item) {
        this.content.add(item);
    }

    public void remove(T item) {
        this.content.remove(item);
    }
}
