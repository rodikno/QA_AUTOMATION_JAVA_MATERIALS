/**
 * Created by Rodion Baronov on 27-Jun-24.
 */
public class ReturnFromLoopExplicitlyDemo {
    public static void main(String[] args) {

        //Оператор return виходить із поточного методу, але також може використовуватись для виходу з циклу, якщо він знаходиться всередині методу.

        //return from loop using return; statement demo example with some printable things in console
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Now i equals: " + i);
                System.out.println("EXITING THE LOOP");
                return;
            }
            System.out.println(i);
        }

        System.out.println("This will never get printed because RETURN kicks us out of the whole method");
    }
}
