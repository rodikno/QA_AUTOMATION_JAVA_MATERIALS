package com.example.intrface;

public class Apple implements Eatable, Squizable {
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
        System.out.println("OUCH! Ok you can get my juice if you squeeze me hard enough");
    }
}
