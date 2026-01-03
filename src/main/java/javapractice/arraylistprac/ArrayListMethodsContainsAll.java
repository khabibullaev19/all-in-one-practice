package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsContainsAll {

    // containsAll() -> to check if one collections contains the elements of another collection.

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(40,30,50,10,100,30,20));

        System.out.println(list2.containsAll(list1));

    }

}
