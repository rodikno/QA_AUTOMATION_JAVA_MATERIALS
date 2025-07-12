public class AnimalPrinter {

    private AnimalPrinter() { }

    public static void printAnimal(Animal animal) {
        System.out.println("PRINTING ANIMAL:");
        System.out.println("Name: " + animal.name);
        System.out.println("Age: " + animal.age);
    }

    public static void printAnimalsTotalCount() {
        Animal.printAnimalCount();
    }


}
