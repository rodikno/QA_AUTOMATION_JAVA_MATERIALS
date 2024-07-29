import com.example.helpers.Gender;
import com.example.helpers.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithoutStreams {
    public static void main(String[] args) {

        List<Person> listOfPersons = Stream.of(
                new Person("Alice", Gender.FEMALE, 34),
                new Person("Bob", Gender.MALE, 32),
                new Person("Charlie", Gender.MALE, 45),
                new Person("Diana", Gender.FEMALE, 31),
                new Person("Ethan", Gender.MALE, 46),
                new Person("Flora", Gender.FEMALE, 36),
                new Person("George", Gender.MALE, 40),
                new Person("Hannah", Gender.FEMALE, 29),
                new Person("Ian", Gender.MALE, 38),
                new Person("Julia", Gender.FEMALE, 42)
        ).collect(Collectors.toList());


        List<Person> filteredPersons = new ArrayList<>();

        //Filtering: persons which are older than 34 and are FEMALE and their name starts with F or with J
        for (Person person : listOfPersons) {
            if (person.getAge() > 34) {
                if (person.getGender().equals(Gender.FEMALE)) {
                    if (person.getName().startsWith("F") || person.getName().startsWith("J")) {
                        filteredPersons.add(person);
                    }
                }
            }
        }


        //sorting list alphabetically by name of a Person
        int n = filteredPersons.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (filteredPersons.get(j).getName().compareTo(filteredPersons.get(j + 1).getName()) > 0) {
                    // Swap people[j] and people[j+1]
                    Person temp = filteredPersons.get(j);
                    filteredPersons.set(j, filteredPersons.get(j + 1));
                    filteredPersons.set(j + 1, temp);
                }
            }
        }




    }
}
