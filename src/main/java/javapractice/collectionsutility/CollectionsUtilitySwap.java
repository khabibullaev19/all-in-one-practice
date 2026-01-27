package javapractice.collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilitySwap {

    public static void main(String[] args) {

        // swap() => Swaps the two elements at the specified indexes in the list.

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,50,40,30));
        System.out.println(arrayList);

        Collections.swap(arrayList,2,4);
        System.out.println(arrayList);

    }

}
