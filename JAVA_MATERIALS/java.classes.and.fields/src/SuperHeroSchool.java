import java.util.ArrayList;

public class SuperHeroSchool {

    int size;
    ArrayList<SuperHero> heroesList = new ArrayList<>();


    public void listAllSuperheroes() {
        this.heroesList.forEach(hero -> System.out.println(hero));
    }

}
