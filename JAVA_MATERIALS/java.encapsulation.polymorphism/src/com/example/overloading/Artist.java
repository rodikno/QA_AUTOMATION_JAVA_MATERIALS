package com.example.overloading;


class Artist {
    // Тут очікуємо об*єкт типу Shape, але насправді можемо приймати і наслідників Shape
    // Це називається поліморфізмом параметрів
    public void drawShape(Shape shape) {
        shape.draw();
    }

    public void drawShape(String shapeName) {
        switch (shapeName) {
            case "CIRCLE":
                System.out.println("DRAWING A CIRCLE");
                break;
            case "SQUARE":
                System.out.println("DRAWING A SQUARE");
                break;
            default:
                System.out.println("I DONT KNOW THIS SHAPE");

        }
    }
}
