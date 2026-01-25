package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopingThroughArrayListWithForEachLoop {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(arrayList);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }

        System.out.println();

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.addAll(Arrays.asList("Name", "Surname", "Age", "Gender"));
        System.out.println(arrayList1);

        for (String s : arrayList1) {
            System.out.print(s + " ");
        }

    }

}
