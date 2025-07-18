package com.example.overloading;


class Artist {

    public void drawShape(Shape shape) {
        shape.draw();
    }

    public void drawShape(String shapeName) {
        switch (shapeName) {
            case "CIRCLE" -> System.out.println("DRAWING A CIRCLE");
            case "SQUARE" -> System.out.println("DRAWING A SQUARE");
            default -> System.out.println("I DON'T KNOW THIS SHAPE");

        }
    }

    public int drawShape(int sides) {
        System.out.println("Drawing a shape with " + sides + " sides");
        return sides;
    }
}

