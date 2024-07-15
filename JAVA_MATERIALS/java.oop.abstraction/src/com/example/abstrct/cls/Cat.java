package com.example.abstrct.cls;

public class Cat extends AbstractAnimal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Purr it's so tasty");
    }
}
