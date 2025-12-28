package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsSizeAndGet {

    // size() -> to get the total number of elements
    // get() -> retrieving the specific element with specific index

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Cydeo", "Java", "SDET"));
        arrayList.add(1,"Python");

        int totalElements = arrayList.size();
        System.out.println("Total elements: " + totalElements);

        System.out.println(arrayList.get(2));

    }

}
