package com.example.generic.classes.helpers;

public class Bun {
    private String title;
    private TasteEnum taste;
    private int softnessLevel;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TasteEnum getTaste() {
        return taste;
    }

    public void setTaste(TasteEnum taste) {
        this.taste = taste;
    }

    public int getSoftnessLevel() {
        return softnessLevel;
    }

    public void setSoftnessLevel(int softnessLevel) {
        this.softnessLevel = softnessLevel;
    }
}
