



public class SuperHeroDemo {
    public static void main(String[] args) {
        // Створюємо об'єкт (супергероя) за шаблоном
        SuperHero lightingWicky = new SuperHero();

        // Присвоюємо конкретні значення полям об*єкту через прямий доступ до них
        lightingWicky.name = "Блискавична Вікі";
        lightingWicky.superpower = "Створює блискавки";
        lightingWicky.weakness = "Вода";

        // Отримуємо значення полів об*єкту через прямий доступ
        System.out.println("ВИ ВІДКРИЛИ НОВОГО СУПЕРГЕРОЯ!");
        System.out.println("Ім'я: " + lightingWicky.name);
        System.out.println("Суперсила: " + lightingWicky.superpower);
        System.out.println("Слабкість: " + lightingWicky.weakness);



    }

    public int addNumbers(int a, int b) {
        return a + b;
    }
}
