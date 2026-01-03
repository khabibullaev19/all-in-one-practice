package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRetainAll {

    // retainAll() -> same with removeAll(), but it does not remove the specified ones,
    //                it removes not specified ones.

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 10, 20, 15, 25));
        System.out.println(list1);

        list1.retainAll(Arrays.asList(10,20));
        System.out.println(list1);

    }

}
