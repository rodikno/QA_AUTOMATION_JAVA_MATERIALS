
public class Character {
    String name; //Ім'я персонажа.
    int health; //Кількість очок здоров'я персонажа.
    int strength; //Атрибут сили, який впливає на силу атаки.
    int defense; //Атрибут захисту, який впливає на зменшення шкоди.
    boolean isAlive = true; //Жив ли персонаж? (по умолчанию жив)
    static int characterCount; //Статичне поле для відстеження кількості створених персонажів.

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;
    }

    /**
     * Імітує атаку на іншого персонажа. Шкода, яка завдається, дорівнює силі атакуючого мінус захист захищаючого (але не менше 0).
     *
     * @param other
     */
    public void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println("\n" + this.name + " атакует " + other.name + " на  " + damage + " урона.");
        other.takeDamage(damage);
    }

    /**
     * Зменшує здоров'я персонажа на величину шкоди.
     *
     * @param damage
     */
    public void takeDamage(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            this.isAlive = false;
        }
        System.out.println(this.name + " получает " + damage + " урон. Здоровье сейчас " + this.health);
    }

    /**
     * Повертає true, якщо здоров'я персонажа більше 0, інакше false.
     */
    public boolean checkLifeStatus() {
        return this.health > 0;
    }

    /**
     * Виводить на екран ім'я персонажа, його здоров'я, силу та захист.
     */
    public void displayStatus() {
        System.out.println(this.name + " - Здоровье: " + this.health + ", Сила: " + this.strength + ", Защита: " + this.defense);
    }

    public static int checkCharacterCount() {
        return characterCount;
    }
}
