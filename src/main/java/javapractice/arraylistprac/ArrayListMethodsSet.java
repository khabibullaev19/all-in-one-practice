package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsSet {

    // set() -> updating the element at the specific index

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(arrayList);

        arrayList.set(2, 300);
        System.out.println(arrayList);

    }

}
