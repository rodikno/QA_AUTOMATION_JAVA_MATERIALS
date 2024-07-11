package com.example.enumdemo;

enum PizzaSize {
    SMALL(8), MEDIUM(12), LARGE(16), EXTRA_LARGE(20);

    private final int diameter;

    PizzaSize(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getDescription() {
        return "Піца " + this.name().toLowerCase() + " має діаметр " + diameter + " дюймів.";
    }
}
