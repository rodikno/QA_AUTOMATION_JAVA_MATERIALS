import java.util.Date;
import java.util.Timer;

/**
 * Created by Rodion Baronov on 26-Jun-24.
 */
public class InfiniteLoopDemo {
    public static void main(String[] args) throws InterruptedException {

        while(true) {
            //display current time with seconds
            System.out.println(new Date());
            Thread.sleep(1000);
        }

    }
}
