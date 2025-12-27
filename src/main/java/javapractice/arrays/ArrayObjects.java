package javapractice.arrays;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

//        int[] numbers1;
//        int numbers2[];
//
//        numbers1 = new int[5];

        int[] numbers = new int[5];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);

//        numbers[6] = 70;
//        System.out.println(Arrays.toString(numbers));

    }

}
