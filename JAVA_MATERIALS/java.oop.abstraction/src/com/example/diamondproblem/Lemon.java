package com.example.diamondproblem;

// Один клас може імплементувати багато інтерфейсів, але наслідувати може тільки один суперклас
public class Lemon extends Fruit implements Eatable, Growable, Juicy, Squeezable {
    @Override
    public void grow() {
        System.out.println("I'm growing");
    }

    @Override
    public void eat() {
        System.out.println("I'm being eaten");
    }


    @Override
    public void extractJuice() {
        System.out.println("Juice extracted");
    }

    @Override
    public void squeeze() {
        System.out.println("OUUUCH!");
    }


}
