package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsAddAll {

    // addAll() -> to add arrays of elements to the list at once, or adding another list to a list

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(2, 4, 6, 8));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);

        // with index
        list3.addAll(2,list2);
        System.out.println(list3);

    }

}
