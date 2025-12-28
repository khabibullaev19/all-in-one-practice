package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRemoveAndClear {

    // remove() -> removes specific element with specific index of object itself,
    //             (if with object itself, the first occurrence of the element)
    // clear() -> clears the list totally

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Java", "C#", "Python", "Java", "Ruby", "C++", "Java"));

        System.out.println(arrayList);

        arrayList.remove("Java");
        System.out.println(arrayList);

        arrayList.remove(3);
        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);

    }

}
