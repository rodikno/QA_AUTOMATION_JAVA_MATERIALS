import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нижче перша частина завдання для прикладу
        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Нижче обробляйте масив, додайте логіку обробки
        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        // System.out.println(Arrays.toString(secretCode));
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
            return;
        }

        // Інші частини пригоди додайте тут!


        int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        System.out.println("Потрапивши у замок, ти бачиш чарівну дошку з числами.");
        for (int number : magicBoard) {
            System.out.print(number + " ");
        }
        System.out.println("Підказка: Сума магічних чисел відкриє ще одну кімнату.");

        int magicBoardSum = 0;
        for (int number : magicBoard) {
            magicBoardSum += number;
        }

        // System.out.println(magicBoardSum);

        int userInput2 = scanner.nextInt();

        if (userInput2 == magicBoardSum) {
            System.out.println("Твоя відповідь вірна! Ти проходиш далі!");
        } else {
            System.out.println("Твоя відповідь не вірна. Ти програв гру.");
            return;
        }


        System.out.println("Для того щоб здолати Дракона, треба передбачити його атаку.");

        int[] dragonAttack = {8, 16, 24, 32, 40};
        boolean allAttacksEven = true;


        for (int attack : dragonAttack) {
            if (attack % 2 != 0) {
                allAttacksEven = false;
                break;
            }
        }

        if (allAttacksEven) {
            System.out.println("Атаки парні! Захист активовано!");
        } else {
            System.out.println("Увага! Непарна атака!");
        }

        int combinedLength = secretCode.length + magicBoard.length + dragonAttack.length;
        int[] magicKey = new int[combinedLength];

        System.arraycopy(secretCode, 0, magicKey, 0, secretCode.length);
        System.arraycopy(magicBoard, 0, magicKey, secretCode.length, magicBoard.length);
        System.arraycopy(dragonAttack, 0, magicKey, secretCode.length + magicBoard.length, dragonAttack.length);

        //System.out.println(Arrays.toString(magicKey));

        System.out.println("Знайди магічний ключ. Яке твоє улюблене число?");
        int favoriteNumber = scanner.nextInt();
        scanner.close();

        boolean keyFound = false;


        for (int number : magicKey) {
            if (number == favoriteNumber) {
                keyFound = true;
                break;
            }
        }

        if (keyFound){
            System.out.println("Твій ключ знайдено!");
        } else {
            System.out.println("Треба більше магії...");
        }
    }

}