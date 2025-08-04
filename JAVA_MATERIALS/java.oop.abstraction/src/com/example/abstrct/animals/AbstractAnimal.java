package com.example.abstrct.animals;


// Я є абстрактним наслідником абстрактного класу
// Тому не зобов'язаний надавати тіло методам батька
abstract class AbstractAnimal extends AbstractLivingCreature {



    protected abstract void makeSound();
    protected abstract void sleep();
}




