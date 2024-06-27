import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] myOneDimArrayEmpty = new int[4];
        System.out.println("myOneDimArrayEmpty[1] = " + myOneDimArrayEmpty[1]);
        int[] myOneDimArrayWithValues = {1, 2, 3, 4}; // 4 elements max
        
        boolean[] myBooleanArray = new boolean[5];
        System.out.println("myBooleanArray[0] = " + myBooleanArray[0]);
        
        
        int[][] myTwoDimArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };; // 12 elements max


        int[][][] myThreeDimArray = new int[5][5][5];
        int[][][][] myFourDimArray = new int[5][5][5][5]; // 625 elements max
        int[][][][][] myFiveDimArray = new int[10][10][10][10][10]; //100k elements max
    }
}