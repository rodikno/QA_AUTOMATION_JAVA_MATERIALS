package com.example.overriding;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("BARK");
    }
}