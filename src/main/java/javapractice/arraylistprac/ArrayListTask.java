package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTask {

    /*
        Task: Rearrange Zeros to the End of an ArrayList

        Write a program that reorganizes an ArrayList by moving all the zeros to the last indexes of the list
        while maintaining the order of the non-zero elements.

        Ex:
           ArrayList: {1, 0, 2, 0, 3, 0, 4, 0}

        Output:
            {1, 2, 3, 4, 0, 0, 0, 0}
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(arrayList);

        int countZeros = Collections.frequency(arrayList,0);

        arrayList.removeAll(Arrays.asList(0));
        System.out.println(arrayList);

        Collections.sort(arrayList);

        for (int i = 0; i < countZeros; i++) {
            arrayList.add(0);
        }

        System.out.println(arrayList);

    }

}
