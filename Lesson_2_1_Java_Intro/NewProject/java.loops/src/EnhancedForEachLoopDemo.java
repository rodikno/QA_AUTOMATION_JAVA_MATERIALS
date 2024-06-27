
public class EnhancedForEachLoopDemo {
    public static void main(String[] args) {

        int[] масив = {1, 2, 3, 4, 5};

        for (int num : масив) {
            System.out.println(num);
        }


        for (int i = 0; i < масив.length; i++) {
            int num = масив[i];
            System.out.println("Number: " + num);
        }

    }
}
