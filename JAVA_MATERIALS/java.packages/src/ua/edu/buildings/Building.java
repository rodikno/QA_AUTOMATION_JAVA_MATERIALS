package ua.edu.buildings;

public class Building {

    private int numberOfFloors;
    private int area;
    private int livingArea;
    protected String material;

    public Building(int numberOfFloors, int area, int livingArea) {
        this.numberOfFloors = numberOfFloors;
        this.area = area;
        this.livingArea = livingArea;
    }



    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(int livingArea) {
        this.livingArea = livingArea;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
