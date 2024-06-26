/**
 * Created by Rodion Baronov on 27-Jun-24.
 */
public class ContinueLoopDemo {
    public static void main(String[] args) {

        /*Оператор continue припускає пропуск поточної ітерації циклу і переходить безпосередньо до наступної ітерації.
         *Використовується, коли потрібно пропустити частину коду циклу, але не припиняти його виконання.
         * */

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Пропустити парні числа
            }
            System.out.println(i); // Вивести лише непарні числа
        }


    }
}
