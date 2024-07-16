package com.example.intrface;

public class Apple extends AbstractFruit implements Squeezable, Eatable {

    @Override
    public void squeeze() {
        System.out.println("OUUCH IM BEING SQUEEZED, TAKE MY JUICE");
    }

    @Override
    public void eat() {
        System.out.println("Ohh IM BEAING EATEN");
    }

    @Override
    public void taste() {
        System.out.println("I'm " + Apple.DEFAULT_TASTE + " and  my weight is " + this.getDefaultMass());
    }

    @Override
    void getJuiciness() {
        System.out.println("OOOH IM SO JUICY");
    }
}
