import com.example.helpers.Gender;
import com.example.helpers.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Person julia = new Person("Julia", Gender.FEMALE, 42);

        List<Person> listOfPersons = Stream.of(
                new Person("Bob", Gender.MALE, 32),
                new Person("Charlie", Gender.MALE, 45),
                new Person("Ethan", Gender.MALE, 46),
                new Person("George", Gender.MALE, 40),
                new Person("Ian", Gender.MALE, 38),
                new Person("Alice", Gender.FEMALE, 34),
                new Person("Diana", Gender.FEMALE, 31),
                new Person("Flora", Gender.FEMALE, 36),
                new Person("Hannah", Gender.FEMALE, 29),
                julia,
                julia,
                julia
        ).collect(Collectors.toList());

        List<List<Person>> listOfLists = Arrays.asList(
                Arrays.asList(new Person("Charlie", Gender.MALE, 45)),
                Arrays.asList(new Person("Ethan", Gender.MALE, 46))
        );

        listOfPersons.forEach(System.out::println);


        List<Person> filteredList = listOfPersons.stream()
                .filter(person -> person.getAge() > 31)
                .filter(person -> person.getGender().equals(Gender.MALE))
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        filteredList.forEach(System.out::println);



        Stream<Person> personStream = listOfPersons.stream().filter(p -> p.getAge() > 34);
        personStream.filter(p -> p.getGender().equals(Gender.FEMALE));

        personStream.collect(Collectors.toList());




        //Examples
        // .filter()
        // .map()
        // .distinct()
        // .sorted()
        // .sorted() з власним компаратором
        // ,limit()
        // .skip()
        // .flatMap(List::stream)




    }
}
