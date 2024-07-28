import com.example.helpers.Dog;
import com.example.helpers.ThingWithAName;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinFuncIntrfcsDemo {
    public static void main(String[] args) {

        //Predicate<T> -> прийняти аргумент і повернути boolean
        Predicate<String> stringIsEmpty = s -> s.isEmpty();

        //Function<T, R> -> прийняти щось з типом T, повернути щось з типом R
        Function<String, Dog> getANewNamedDog = Dog::new;
        Dog johny = getANewNamedDog.apply("Johny");

        //Supplier<T> -> не приймати нічого, повернути щось типу T
        Supplier<ThingWithAName> thingSupplier = ThingWithAName::new;
        ThingWithAName thingWithAName = thingSupplier.get();

        //Consumer<T> -> прийняти щось типу T, нічого не повертати
        Consumer<String> printThing = System.out::println;
        Consumer<String> printThingWithExclamationMarks = thing -> System.out.println(thing + "!!!");

        List<String> list = Arrays.asList("Alice", "Bob", "Jenny");
        list.forEach(printThing.andThen(printThingWithExclamationMarks));


    }
}
