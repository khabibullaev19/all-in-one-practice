package javapractice.collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityFrequency {

    public static void main(String[] args) {

        // frequency() => Returns the frequency of the specified element in the specified collection.

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50,60,10,10,10,10));
        System.out.println(arrayList);

        int frequencyOf10 = Collections.frequency(arrayList,10);
        System.out.println(frequencyOf10);

    }

}
