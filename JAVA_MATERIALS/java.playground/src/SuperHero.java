import java.util.Random;
public class SuperHero {

    private String name;
    private int baseAttack;
    private int baseDefense;
    private int health;
    private String specialAbility;
    private Random random = new Random();

    public SuperHero(String name, int attackPower, int defensePower, String specialAbility) {
        this.name = name;
        this.baseAttack = attackPower;
        this.baseDefense = defensePower;
        this.health = 100;
        this.specialAbility = specialAbility;
    }

    public void attack(SuperHero opponent) {
        int attackPower = baseAttack;
        if (random.nextInt(100) < 20) {
            attackPower += 10;
            System.out.println(" " + name + " використовує суперздібність: " + specialAbility + "!");
        }

        int damage = Math.max(0, attackPower - opponent.baseDefense);
        System.out.println(name + " атакує " + opponent.name + " і завдає " + damage + " ушкоджень.");
        opponent.takeDamage(damage);
    }

    public void applyRandomBuff() {
        int chance = random.nextInt(100);
        if (chance < 10) {
            baseAttack += 5;
            System.out.println(" " + name + " отримує бонус до атаки (+5) цього раунду!");
        } else if (chance < 20) {
            baseDefense += 5;
            System.out.println(" " + name + " отримує бонус до захисту (+5) цього раунду!");
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void printStatus() {
        System.out.println("Герой " + this.name);
        System.out.println("Залишок здоров*я " + this.health);
    }
}