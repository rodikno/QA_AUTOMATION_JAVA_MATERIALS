public class Human {

    String name;
    int age;
    int applesBitten;

    public Apple bite(Apple apple) {
        apple.weight = apple.weight - 0.01;
        return apple;
    }
}
