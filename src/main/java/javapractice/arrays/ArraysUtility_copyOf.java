package javapractice.arrays;

import java.util.Arrays;

public class ArraysUtility_copyOf {

    /*

        // * copyOf() - Returns new array, copies the specified array,
             (truncating or padding with zeros if necessary).

     */

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400};
        int[] numbers2 = Arrays.copyOf(numbers, 3);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        // if we give more than the range of the old array,
        // we get the default results for the remaining range
        int[] numbers3 = Arrays.copyOf(numbers, 7);
        System.out.println(Arrays.toString(numbers3));

    }

}
