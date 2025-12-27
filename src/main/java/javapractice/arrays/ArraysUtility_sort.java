package javapractice.arrays;

import java.util.Arrays;

public class ArraysUtility_sort {

    // * sort() - Sorts the complete array in ascending order.

    public static void main(String[] args) {

        int[] numbers = {100, 50, 20, 10, 80, 90, 60, 30, 20, 40};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Ruby", "Java", "Python", "C#"};
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }

}
