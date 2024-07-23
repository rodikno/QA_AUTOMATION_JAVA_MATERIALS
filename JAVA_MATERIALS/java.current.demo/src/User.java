import java.util.HashSet;

public class User implements UserInterface {
    private String name;
    private HashSet<UserInterface> contacts = new HashSet<>();


    @Override
    public void addContact(UserInterface user) {
        contacts.add(user);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public HashSet<UserInterface> getContacts() {
//        return this.contacts;
//    }


    @Override
    public String toString() {
        System.out.println("Hello My name is:");
        System.out.println(this.name);
        System.out.println("My list of contacts:");
        this.contacts.forEach(contact -> System.out.println(contact.getName()));

        return "===========";
    }
}
