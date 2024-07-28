package com.example.helpers;

public class ThingWithAName implements Printable {

    String name;

    public ThingWithAName() {
    }

    public ThingWithAName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("My name is: " + this.name);
    }

    public boolean nameIsEmpty() {
        return this.name.isEmpty();
    }
}
