import java.util.Scanner;

/**
 * Created by Rodion Baronov on 27-Jun-24.
 */
public class BreakLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Оператор break припиняє виконання циклу негайно і переходить до наступного оператора після циклу.
         * Використовується, коли потрібно негайно завершити цикл після досягнення певної умови
         * */
        while (true) {
            System.out.println("Введіть слово яке хочете зробити КАПІТАЛІЗОВАНИМ або exit для виходу:");
            // Читання введення користувача
            String input = scanner.nextLine();

            // Перевірка на вихід
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Вихід з програми");
                break; // Переривання циклу
            }

            // Інші дії з введеним текстом
            input = input.toUpperCase();
            System.out.println("Ваш капіталізований текст: " + input);
        }

        System.out.println("THANK YOU FOR USING OUR PROGRAM!!!");

    }
}
