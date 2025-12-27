package javapractice.arrays;

import java.util.Arrays;

public class ArrayLiteral {

    /*

        - Like regular variables, Java also allows you to initialize
          an array's elements when you create the array.

     */

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

    }

}
