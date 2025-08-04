import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {





        String[] names = new String[10];

        // Nein! Nein! Nein! IndexOutOfBounds Guten Morgen!
        names[10] = "Adolf";



        HashMap<String, String> phoneBook = new HashMap<>();
        //Add entries
        phoneBook.put("John", "123-456-7890");
        phoneBook.put("Jane", "098-765-4321");
        phoneBook.put("Bob", "000-000-4567");
        //Get value by key
        String johnsPhoneNumber = phoneBook.get("John");
        //Remove entry by key
        phoneBook.remove("Jane");
        //Check if empty
        phoneBook.isEmpty();


        HashSet<String> colors = new HashSet<>();
        //Add element
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        //Remove element
        colors.remove("Red");
        //Check if contains element
        colors.contains("Red"); //false
        //Check if empty
        boolean empty = colors.isEmpty();


        ArrayList<String> shoppingItems = new ArrayList<>();
        // Add elements
        shoppingItems.add("Coca Cola");
        shoppingItems.add("Coffee");
        shoppingItems.add("Milk");

        //Get values of elements by Index
        shoppingItems.get(0);
        //Set values of elements by Index
        shoppingItems.set(1, "Cookies");

        //Remove items
        shoppingItems.remove("Coca Cola");
        shoppingItems.remove(2);












        Scanner scanner = new Scanner(System.in);

        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            System.out.print(" Введи число " + (i + 1) + " : ");
            int userInput = scanner.nextInt();
            if (userInput != secretCode[i]) {
                isCodeCorrect = false;
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
            scanner.close();
            return;
        }

        System.out.println("Потрапивши у замок, ти бачиш чарівну дошку з числами.Розв'яжи загадку");

        int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        System.out.print("На дошці написано числа: ");
        for (int number : magicBoard) {
            System.out.print(number + " ");
        }
        System.out.println();

        int actualSum = 0;
        for (int number : magicBoard) {
            actualSum += number;
        }

        System.out.println("Сума всіх магічних чисел: " );
        int userSum = scanner.nextInt();
        if (userSum == actualSum) {
            System.out.println("Вітаю!Кімната відкрилась!Ти можеш йти далі.");
        } else {
            System.out.println("Невірно.Спробуй ще.");
        }
        System.out.println("Перед тобою з'явився Дракон!Захищайся,активувуй захист!");

        int[] dragonAttacks = {8, 16, 24, 32, 40};
        boolean allEven = true;

        for (int attack : dragonAttacks) {
            if (attack % 2 != 0) {
                allEven = false;
                break;
            }
        }
        if (allEven) {
            System.out.println("Атаки парні! Захист активовано.");
        } else {
            System.out.println("Увага!Непарна атака!");
        }

        System.out.println("Щоб знайти магічний ключ,введи своє улюблене число:");
        int favoriteNumber = scanner.nextInt();
        boolean found = false;

        int[][] allSources = { secretCode, magicBoard, dragonAttacks };

        outerLoop:
        for (int[] source : allSources) {
            for (int number : source) {
                if (number == favoriteNumber) {
                    found = true;
                    break outerLoop;
                }
            }
        }

        if (found) {
            System.out.println("Твій ключ знайдено!Ти можеш пройти далі.");
        } else {
            System.out.println("Треба більше магії...Спробуй ще.");
        }

        scanner.close();

    }
}