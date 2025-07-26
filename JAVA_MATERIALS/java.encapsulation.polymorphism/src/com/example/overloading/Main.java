package com.example.overloading;

public class Main {
    public static void main(String[] args) {

        Artist artist = new Artist();
        Shape myShape = new Shape();
        Circle myCircle = new Circle();
        Square mySquare = new Square();
        Triangle myTriangle = new Triangle();

        artist.drawShape(myShape);
        artist.drawShape("SQUARE");
        int sidesDrawn = artist.drawShape(8);



    }
}
