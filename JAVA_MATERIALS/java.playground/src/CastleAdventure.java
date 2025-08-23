import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нижче перша частина завдання для прикладу
        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Нижче обробляйте масив, додайте логіку обробки
        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }

        // Частина 2 Магічна задача
        int[] noteOnTheBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int sum = 0;
        for (int i = 0; i < noteOnTheBoard.length; i++) {
            sum += noteOnTheBoard[i];
        }
        System.out.println(" Сума магічних чисел: " + sum);
        System.out.println("Тобі відкрилась наступна кімната");


        // Частина 3 Перемогти Залізного дракона
        //
        int[] atackOfDragon = {8, 16, 24, 32, 40};
        boolean evenNumbers = true;
        for (int fight : atackOfDragon) {
            if (fight % 2 != 0) {
                evenNumbers = false;
                break;
            }
            if (evenNumbers) {
                System.out.println("Атаки парні! Захист активовано!");
            } else {
                System.out.println("Увага! Непарна атака!");
            }
        }
        // Частина 4 Знайти магічний ключ

        // Щоб полегшити собі задачу, вирішила створити один масив з трьох))

        int[] allNumbers = {
                7, 14, 28, 56, 112,     // код дверей
                3, 6, 9, 12, 15, 18, 21, 24, 27, 30,   // магічна дошка
                8, 16, 24, 32, 40       // атаки дракона
        };
        System.out.print("Введіть своє улюблене число: ");
        int favorite = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < allNumbers.length; i++) {
            int num = allNumbers[i];
            if (num == favorite) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(" Твій ключ знайдено! Вітаємо, герой!");
        } else {
            System.out.println(" Треба більше магії...");
        }
    }
}