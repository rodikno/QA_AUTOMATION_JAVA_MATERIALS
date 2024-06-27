/**
 * Created by Rodion Baronov on 27-Jun-24.
 */
public class NestedLoopsDemo {
    public static void main(String[] args) {

        //Друкує таблицю множення в консолі з допомогою двох циклів for, де один цикл ВКЛАДЕНО в інший


        int size = 10; // Size of the multiplication table

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t"); // Print the product and a tab space
            }
            System.out.println(); // Move to the next line after each row

        }
    }
}
