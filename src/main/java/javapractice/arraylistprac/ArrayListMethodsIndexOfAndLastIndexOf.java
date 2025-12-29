package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsIndexOfAndLastIndexOf {

    // indexOf() -> returns the index of specified element
    // lastIndexOf -> return the index of last occurrence of the specified element

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Java", "C#", "Python", "Java", "Ruby", "C++"));

        System.out.println(arrayList.indexOf("Python"));
        System.out.println(arrayList.lastIndexOf("Java"));

    }

}
