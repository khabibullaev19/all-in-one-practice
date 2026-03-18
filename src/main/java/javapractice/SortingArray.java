package javapractice;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] array = {2, 6, 34, 3, 6, 88};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int min;
        for (int i = 0; i < array.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }

            }

            //array[i] = min;


        }

        System.out.println(Arrays.toString(array));

    }

}
