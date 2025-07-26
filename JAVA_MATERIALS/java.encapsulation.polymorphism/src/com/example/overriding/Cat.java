package com.example.overriding;

class Cat extends Animal {


    public void jump() {
        System.out.println("Cat is jumping");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
