package com.example.generic.classes;

import com.example.generic.classes.helpers.*;

public class Main {
    public static void main(String[] args) {

        UniversalBoxOf<Bun> box = new UniversalBoxOf<>();

        Bun myBun = new Bun();
        myBun.setTitle("Sweet bun");
        myBun.setTaste(Taste.SWEET);
        myBun.setSoftnessLevel(10);



        Chocolate choco = new Chocolate();
        choco.setTitle("Milka");
        choco.setType(ChocolateType.MILK);

        Candy candy = new Candy();
        candy.setTitle("Shipuchka");
        candy.setTaste(Taste.SOUR);


        BoxOfSweetThings<Candy> candyBox = new BoxOfSweetThings<>();
        BoxOfSweetThings<Chocolate> chocolateBox = new BoxOfSweetThings<>();



        printAllThingsFromTheBox(candyBox);
        printAllThingsFromTheBox(chocolateBox);
//        chocoBox.addChocolate(candy); -> this won't work
//
//        Box<Chocolate> box = new Box<>();
//        box.addSweetieToTheBox(choco);

    }


    public static void printAllThingsFromTheBox(BoxOfSweetThings<?> box) {
        System.out.println(box);
    }


}