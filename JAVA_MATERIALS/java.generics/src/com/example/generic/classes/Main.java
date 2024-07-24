package com.example.generic.classes;

import com.example.generic.classes.helpers.Candy;
import com.example.generic.classes.helpers.Chocolate;
import com.example.generic.classes.helpers.ChocolateType;
import com.example.generic.classes.helpers.TasteEnum;

public class Main {
    public static void main(String[] args) {

        Chocolate choco = new Chocolate();
        choco.setTitle("Milka");
        choco.setType(ChocolateType.MILK);

        Candy candy = new Candy();
        candy.setTitle("Shipuchka");
        candy.setTaste(TasteEnum.SOUR);


        BoxOfChocolates chocoBox = new BoxOfChocolates();
        chocoBox.addChocolate(choco);

//        chocoBox.addChocolate(candy); -> this won't work

        Box<Chocolate> box = new Box<>();
        box.addSweetieToTheBox(choco);

    }
}