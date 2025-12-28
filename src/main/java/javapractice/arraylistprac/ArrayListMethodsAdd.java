package javapractice.arraylistprac;

import java.util.ArrayList;

public class ArrayListMethodsAdd {

    // add() -> adds an element to a list

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ben");
        arrayList.add("John");
        arrayList.add("Lucy");

        arrayList.add(2,"Name");

        System.out.println(arrayList);

    }

}
