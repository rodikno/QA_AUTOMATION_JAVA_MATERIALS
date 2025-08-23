package example.equalshashcode;

import java.util.Objects;

public class User {

    public String name;
    public int age;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.age == user.age && Objects.equals(this.name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
