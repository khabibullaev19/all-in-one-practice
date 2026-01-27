package javapractice.collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilitySort {

    public static void main(String[] args) {

        // sort() -> Sorts the complete collection in ascending order.

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50,60,20,20,10,15,200,300,0,-5));

        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

}
