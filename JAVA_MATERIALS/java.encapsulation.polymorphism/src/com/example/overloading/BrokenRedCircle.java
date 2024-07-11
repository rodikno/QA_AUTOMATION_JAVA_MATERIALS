package com.example.overloading;

public class BrokenRedCircle extends BrokenCircle{

    void doSmth(){
        draw();
    }
    // Shape -> Circle -> BrokenCircle -> BrokenRedCircle
}
