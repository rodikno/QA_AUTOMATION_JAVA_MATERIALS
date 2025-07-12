package edu.example.animals;

public class Animal {

    static final int MAX_AGE = 100;
    int age;
    String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println("I'm eating something");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void makeSound() {
        System.out.println("I'm making a sound like an animal");
    }

}
