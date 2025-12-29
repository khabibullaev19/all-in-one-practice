package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsEqualsAndIsEmpty {

    // equals() -> comparing one arraylist object with another arraylist object
    // isEmpty() -> to check if the list is empty or not

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("Java", "C#", "Python"));

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Java", "C#", "Python"));

        System.out.println(list1.equals(list2));
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1.isEmpty());

    }

}
