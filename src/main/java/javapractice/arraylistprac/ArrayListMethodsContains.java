package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsContains {

    // contains() -> verifying if the specific element is included in the list or not

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Java", "C#", "Python", "Java", "Ruby", "C++"));

        System.out.println(arrayList.contains("Java"));
        System.out.println(arrayList.contains("Swift"));

    }

}
