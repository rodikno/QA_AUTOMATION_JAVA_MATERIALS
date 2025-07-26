package com.example.abstrct.animals;


// Цей абстрактний клас є імплементатором інтерфейсу Hunter
// Але надавати реалізацію методам інтерфейсу не зобов'язаний
abstract class AbstractLivingCreature implements Hunter {

    protected abstract void breathe();

}
