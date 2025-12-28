package javapractice.arrays;

import java.util.Arrays;

public class LoopingThroughMultiDArray {

    public static void main(String[] args) {

        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};


        for (int[] array : array2D) {

            System.out.println(Arrays.toString(array));

            for (int each : array) {
                System.out.print(each + " ");
            }

            System.out.println();

        }

        for (int i = 0; i < array2D.length; i++) {

            //System.out.println(Arrays.toString(array2D[i]));

            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }

        }

        System.out.println();

        for (int i = array2D.length - 1; i >= 0; i--) {

            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.print(array2D[i][j] + " ");
            }

        }

    }

}
