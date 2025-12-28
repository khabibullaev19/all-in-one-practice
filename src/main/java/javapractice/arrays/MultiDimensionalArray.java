package javapractice.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

    /*

        - An Array of Arrays.
        - A special variable that's used as a container of arrays.
        - The N dimensional array is a container for (N-1) dimensional arrays.

        int[][] array2D = new int[size][size];
        int[][] array2D = {{elements}, {elements}, {elements}};

     */

    public static void main(String[] args) {

        int[][] arr2D = new int[3][3];

        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        System.out.println(array2D.length);
        System.out.println(Arrays.deepToString(array2D));

        System.out.println(Arrays.toString(array2D[1]));
        System.out.println(Arrays.toString(array2D[0]));
        System.out.println(Arrays.toString(array2D[2]));

        System.out.println(array2D[1][2]);
        System.out.println(array2D[0][2]);

    }

}
