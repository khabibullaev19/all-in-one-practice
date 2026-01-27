package javapractice.collectionsutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMinAndMax {

    public static void main(String[] args) {

        // min() -> Returns the minimum element in the specified collection.
        // max() -> Returns the maximum element in the specified collection.

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50,60,20,20,10,15,200,300,0,-5));

        int maxValue = Collections.max(arrayList);
        int minValue = Collections.min(arrayList);

        System.out.println(maxValue);
        System.out.println(minValue);

    }

}
