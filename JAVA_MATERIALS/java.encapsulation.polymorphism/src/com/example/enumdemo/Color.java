package com.example.enumdemo;

public enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    // Поля для збереження значень RGB
    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    // Приватний конструктор для ініціалізації полів
    Color(int red, int green, int blue) {
        this.redValue = red;
        this.greenValue = green;
        this.blueValue = blue;
    }

    // Метод для отримання значення червоного кольору
    public int getRedValue() {
        return redValue;
    }

    // Метод для отримання значення зеленого кольору
    public int getGreenValue() {
        return greenValue;
    }

    // Метод для отримання значення синього кольору
    public int getBlueValue() {
        return blueValue;
    }

    // Метод для отримання повного опису кольору
    public String getDescription() {
        return "Color " + this.name() + " has RGB values: (" + redValue + ", " + greenValue + ", " + blueValue + ")";
    }
}
