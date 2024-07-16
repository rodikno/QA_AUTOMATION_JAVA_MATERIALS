package com.example.abstrct.cls;

public class Cat extends AbstractAnimal {

    public Cat(String name, int age) {
        super(name, age);

    }

    @Override
    protected void makeSound() {
        System.out.println("Мяу!");
    }


    @Override
    void eat() {
        System.out.println("Ням-ням я котик");
    }
}
