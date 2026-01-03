package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRemoveAll {

    // removeAll() -> used for removing elements(collection) from a collection,
    //                it removes all the matching specified elements.

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 10, 20, 15, 25));

        System.out.println(list1);

        list1.removeAll(Arrays.asList(10,20));
        System.out.println(list1);

    }

}
