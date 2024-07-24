@VeryImportant
public class Cat {

    private String name;
    private int age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately
    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Purr I'm eating something");
    }
}
