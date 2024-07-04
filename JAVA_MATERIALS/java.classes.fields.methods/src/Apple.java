public class Apple {

    static int totalApplesCount;

    public Apple() {
        totalApplesCount++;
    }

    double weight;
    String color;
    String taste;
    boolean isRipe;


    public void ripe() {
        this.isRipe = true;
        this.color = "Red";
    }




}
