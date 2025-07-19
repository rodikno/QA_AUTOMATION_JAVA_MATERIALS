package ua.edu.buildings;

import java.util.Arrays;

public class House extends Building {

    private int doorsCount;
    private boolean isEntranceOpen = false;
    private String[] accessKeys = {"husband", "wife", "child"};

    public House(int numberOfFloors, int area, int livingArea) {
        super(numberOfFloors, area, livingArea);
    }


    public void setMaterial(String materialName) {
        this.material = materialName;
    }


    public void openEntrance(String key) {
        for (String accessKey : accessKeys) {
            if (accessKey.equals(key)) {
                this.isEntranceOpen = true;
                System.out.println("WELCOME HOME, dear " + accessKey);
                return;
            }
        }
        if (!this.isEntranceOpen) {
            System.out.println("SORRY YOU DONT HAVE ACCESS");
        }
    }

    public boolean isEntranceOpen() {
        return isEntranceOpen;
    }


    public void closeEntrance() {
        this.isEntranceOpen = false;
    }


    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }




}
