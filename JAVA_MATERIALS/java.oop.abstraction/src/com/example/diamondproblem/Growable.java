package com.example.diamondproblem;

public interface Growable {
    // Я маю абстрактний метод тому компілятору не буде
    // проблеми зрозуміти яке тіло методу використовувати
    // в класі-імплементаторі
    void grow();
}


