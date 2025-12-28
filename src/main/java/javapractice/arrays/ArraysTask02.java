package javapractice.arrays;

import java.util.Arrays;

public class ArraysTask02 {

    /*

        Task: Merge Two integer Arrays into a Third Array

        Write a program that can merge two arrays of integers into a third array.

        Ex:
            Array 1: {1, 2, 3, 4}
            Array 2: {5, 6, 7, 8, 9, 10}

        Output:
                Merged Array: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10};

        int[] result = new int[array1.length + array2.length];
        int i = 0;

        for (int each : array1) {
            result[i] = each;
            i++;
        }

        for (int each : array2) {
            result[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(result));

    }

}
