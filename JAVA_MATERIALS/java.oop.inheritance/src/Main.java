public class Main {
    public static void main(String[] args) {

        Food sausage = new Food("Sausage", 50);

        Animal someAnimal = new Animal();
        Dog myDoggo = new Dog();


        someAnimal.eat(sausage);
        myDoggo.bark();



    }
}