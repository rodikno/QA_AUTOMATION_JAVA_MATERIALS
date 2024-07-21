import java.util.HashSet;

public interface UserInterface {


    //тут інші методи які треба по завданню
    public String getName();
    public void setName(String name);

    HashSet<UserInterface> getContacts();

    void addContact(UserInterface user);
}
