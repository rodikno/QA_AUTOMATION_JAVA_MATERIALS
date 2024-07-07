import java.util.ArrayList;

public class Animal {

    String name;
    int age;
    ArrayList<Food> eatenFoods = new ArrayList<>();


    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat(Food food) {
        this.eatenFoods.add(food);
        System.out.println("I've eaten a " + food.name + " and got " + food.calories + " calories from it");
    }

}