public class Dog extends Animal {

    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Hi I'm a dog, my name is " + this.name);
    }

    void bark() {
        System.out.println("Bark, bark, bark!");
    }


    @Override
    void eat(Food food) {
        super.eat(food);
        System.out.println("TY, but I also enjoy bones");
    }
}
