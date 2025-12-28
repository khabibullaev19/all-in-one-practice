package javapractice.arraylistprac;

import java.util.ArrayList;

public class ArrayListIntro {

    /*

        - Presented in "java.util" package.
        - Allows us to store objects.
        - Size is automatically adjusted (has add and remove functions).
        - Does not support primitives.

     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Car");
        arrayList.add("Ben");

        System.out.println(arrayList);

    }

}
