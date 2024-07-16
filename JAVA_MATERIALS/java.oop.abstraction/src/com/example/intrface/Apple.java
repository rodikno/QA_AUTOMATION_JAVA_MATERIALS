package com.example.intrface;

public class Apple implements Eatable, Squeezable {
    @Override
    public void eat() {
        System.out.println("I'm an apple which is being eaten");
    }

    @Override
    public void taste() {
        System.out.println("Tastes good");
    }


    @Override
    public void squeeze() {

    }
}
