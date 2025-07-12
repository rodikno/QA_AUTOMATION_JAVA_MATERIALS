public class Animal {

    static int animalCount = 0;
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        increaseAnimalCount();
    }

    public Animal() {
        increaseAnimalCount();
    }

    public static void printAnimalCount() {
        System.out.println("I have created " + animalCount + " animals");
    }

    public void makeSound() {
        System.out.println("I'm an animal");
        System.out.println( "My name is " + name);
    }

    private void increaseAnimalCount() {
        if (animalCount <= 5) {
            animalCount++;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void print() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
    }

}
