import java.util.Arrays;

public class _14_ArraysTask {

    public static void main(String[] args) {
        // arrays in arrays
        double[][] prices = new double[10][10];
        prices[0][0] = 2.0;
        prices[1][2] = 3.0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]" + "=" + prices[i][j]);
            }
        }

        // fill in loop array with values
        //  1  2  3  4  5
        //  2  4  6  8  10
        //  3  6  9  12 15
        //  4  8  12 16 20
        //  5  10 15 20 25
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
