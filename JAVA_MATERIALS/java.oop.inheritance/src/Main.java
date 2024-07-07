public class Main {
    public static void main(String[] args) {

        Food sausage = new Food("Sausage", 50);
//
//        Animal someAnimal = new Animal("DefaultAnimal", 99);
//        someAnimal.eat(sausage);

        Dog myDoggo = new Dog("Johny", 5, "Alaskan Malamute");

        myDoggo.eat(sausage);
        myDoggo.bark();



    }
}