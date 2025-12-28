package javapractice.arrays;

public class ArraysTask01 {

    /*

        Task: Find Common Elements in Two Integer Arrays

        Write a program that finds and prints the common elements present in two integer arrays.

            Ex:
               Array 1: {1, 2, 3, 4, 5}
               Array 2: {4, 5, 6, 7, 8, 9, 10, 11, 12}

           Output:
                    Common Elements: 4 5

     */

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i : arr1) {

            for (int j : arr2) {

                if (i == j) {
                    System.out.print(i + " ");
                }

            }

        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }

            }

        }

    }

}
