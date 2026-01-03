package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopingThroughArrayListInIndexOrder {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
        }

    }

}
