import com.example.helpers.Cat;
import com.example.helpers.Printable;
import com.example.helpers.ThingWithAName;

import java.lang.invoke.VarHandle;
import java.util.Collection;

public class NoLambdasDemo {

    public static void main(String[] args) {

        // Create a new object of a com.example.helpers.ThingWithAName
        // Print it by calling its .print() method -> OOP style
        // print it by using printThing(com.example.helpers.Printable thing) method -> functional style (pay attention method accepts com.example.helpers.Printable interface type
        // define a printable thing using anonymous class definition
        // define the same, but using a lambda expression to provide just an implementation of a single abstract method
        // Make .print() method of an Interface accept a variable
        // Make .print() method of an Interface return value
        // Provide some examples of standard java.util FunctionalInterfaces: Predicate, Consumer, Supplier, Function

        ThingWithAName anotherThing = new ThingWithAName("dwwrww");
        anotherThing.print();
        printThing(anotherThing);

        Cat myCat = new Cat();
        Printable somethingPrintable = new Printable() {
            @Override
            public void print() {
                System.out.println("Meow");
            }
        };

        printThing(somethingPrintable);

        Printable lambdaPrintable = () -> {
            System.out.println("Meow");
        };

        printThing(lambdaPrintable);





//        //OOP Style
//        ThingWithAName thing = new ThingWithAName("Pineapple John");
//        thing.print(); //prints "Pineapple John"
//
//        //Not really an OOP style -> calling a function and passing object as a parameter
//        printThing(thing); // prints "Pineapple John"
//
//
//        //Anonymous class definition in place to override the interface method (works with interfaces)
//        Printable somethingPrintable = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("Hey I like to be printed");
//            }
//        };
//        printThing(somethingPrintable);
//
//        // The Same but with lambda expression
//        Printable lambdaPrintable = () -> {
//            System.out.println("Hey I like to be printed");
//        };


//        printThing(lambdaPrintable);

    }


    public static void printThing(Printable thing) {
        thing.print();
    }
}
