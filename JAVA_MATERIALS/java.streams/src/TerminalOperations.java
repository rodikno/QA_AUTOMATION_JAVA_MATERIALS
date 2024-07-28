import com.example.helpers.Gender;
import com.example.helpers.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.DataFormatException;

public class TerminalOperations {

    public static void main(String[] args) {

        Person julia = new Person("Julia", Gender.FEMALE, 42);


        List<Person> listOfPersons = Stream.of(
                new Person("Alice", Gender.FEMALE, 34),
                new Person("Bob", Gender.MALE, 32),
                new Person("Charlie", Gender.MALE, 45),
                new Person("Diana", Gender.FEMALE, 31),
                new Person("Ethan", Gender.MALE, 46),
                new Person("Flora", Gender.FEMALE, 36),
                new Person("George", Gender.MALE, 40),
                new Person("Hannah", Gender.FEMALE, 29),
                new Person("Iris", Gender.FEMALE, 33),
                new Person("Jack", Gender.MALE, 35),
                new Person("Karen", Gender.FEMALE, 38),
                new Person("Liam", Gender.MALE, 42),
                new Person("Mia", Gender.FEMALE, 27),
                new Person("Nathan", Gender.MALE, 30),
                new Person("Olivia", Gender.FEMALE, 29),
                new Person("Paul", Gender.MALE, 32),
                new Person("Ian", Gender.MALE, 38),
                new Person("Julia", Gender.FEMALE, 42),
                new Person("Dora", Gender.FEMALE, 67),
                new Person("Oksana", Gender.FEMALE, 90)
        ).collect(Collectors.toList());

        List<List<Person>> listOfLists = Arrays.asList(
                Arrays.asList(new Person("Charlie", Gender.MALE, 45)),
                Arrays.asList(new Person("Ethan", Gender.MALE, 46))
        );


        // Example
        listOfPersons.stream()
                .filter(p -> p.getAge() > 60)
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //forEach
        //collect
        //count -> int
        //reduce -> reduced T
        //toArray -> Person[]::new
        //findFirst -> Optional<T>
        //findAny -> Optional<T>
        //anyMatch -> boolean
        //allMatch -> boolean
        //noneMatch -> boolean

//        listOfPersons.stream().forEach(System.out::println);
//
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
//        Integer reduce = listOfIntegers.stream().reduce(0, Integer::sum);
//        System.out.println(reduce);


    }


}
