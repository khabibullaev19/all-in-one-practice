package javapractice.collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityReplaceAll {

    public static void main(String[] args) {

        // replaceAll() => Replaces all occurrences of a specified element in a list with a new element.

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50,60,10,10,10,10));
        System.out.println(arrayList);

        Collections.replaceAll(arrayList,10,100);
        System.out.println(arrayList);

    }

}
