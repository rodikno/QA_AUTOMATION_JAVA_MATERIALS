package com.example.overloading;

public class Main {
    public static void main(String[] args) {

        Artist artist = new Artist();
        Shape myShape = new Shape();

//        artist.drawShape(myShape);
//        artist.drawShape("OVAL");
        int sides = artist.drawShape(8);
        System.out.println(sides);

    }
}
