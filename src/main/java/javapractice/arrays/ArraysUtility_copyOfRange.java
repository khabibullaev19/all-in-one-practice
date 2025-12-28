package javapractice.arrays;

import java.util.Arrays;

public class ArraysUtility_copyOfRange {

    /*

        * copyOfRange() - Returns new array, copies the specified range of the specified array.

     */

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        // indexes:       0   1   2   3   4   5   6   7   8

        // the given second index is excluded
        int[] numbers2 = Arrays.copyOfRange(numbers, 2, 5);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));


    }

}
