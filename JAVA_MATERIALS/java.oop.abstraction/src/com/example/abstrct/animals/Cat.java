package com.example.abstrct.animals;


public class Cat implements Hunter {

    @Override
    public void hunt() {
        System.out.println("I'm hunting");
    }

    @Override
    public void catchPrey() {
        // Метод meowLikeAHunter() був унаслідуваний з інтерфейсу
        System.out.println("Jumping");
        System.out.println("Catching prey");
        System.out.println("Prey is caught");
        // Цей метод визначений статичним в інтерфейсі тому можна викликати його так
    }


}



