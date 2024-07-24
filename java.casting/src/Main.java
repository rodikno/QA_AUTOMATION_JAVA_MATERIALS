public class Main {
    public static void main(String[] args) {

        /*
        * Animal
        *    | -> Dog
        *    | -> Cat
        *
        * Кожен Dog або Cat є Animal
        * Якийсь Animal необов*язково є Dog або Cat (він може бути Dog або Cat, а може бути просто Animal)
        * */


        // Upcasting: безпечне перетворення
        Dog dog = new Dog();
        Animal animal = dog; // Upcasting
        animal.makeSound();  // Викликає метод makeSound() класу Animal, виведе "Animal sound"

        //======================================================

        // Downcasting: небезпечне перетворення, але з перевіркою на приналежність
        Animal anotherAnimal = new Dog(); // Upcasting, Dog стає Animal
        if (anotherAnimal instanceof Dog) {
            Dog anotherDog = (Dog) anotherAnimal; // Downcasting
            anotherDog.bark();  // Викликає метод bark() класу Dog, виведе "Woof"
        } else {
            System.out.println("Неправильний тип, перетворення неможливе.");
        }

        // Небезпечний Downcasting без перевірки instanceof
        Animal justAnimal = new Animal();
        try {
            Cat cat = (Cat) justAnimal; // Неправильне перетворення, викликає ClassCastException
            cat.meow();
        } catch (ClassCastException e) {
            System.out.println("Помилка: неправильне перетворення типів.");
        }

    }
}