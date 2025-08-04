package com.example.abstrct.animals;


// Цей абстрактний клас є імплементатором інтерфейсу Hunter
// Але надавати реалізацію методам інтерфейсу не зобов'язаний
abstract class AbstractLivingCreature {

    public int health = 100;

    public abstract void eat();
    protected abstract void breathe();

}
