package com.example.overloading;

public class BrokenCircle extends Circle {

    @Override
    public void draw() {
        System.out.println("IM A BROKEN CIRCLE!");
    }


    public void draw(String smth) {
        System.out.println("IM A BROKEN CIRCLE!");
    }
    // Shape -> Circle -> BrokenCircle
}
