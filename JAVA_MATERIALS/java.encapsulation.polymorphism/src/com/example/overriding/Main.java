package com.example.overriding;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Викличе перевизначені методи
        myDog.makeSound(); // Dog barks
        myCat.makeSound(); // Cat meows
    }
}
