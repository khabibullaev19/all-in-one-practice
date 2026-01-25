package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopingThroughArrayListInReversedOrder {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(arrayList);

        for (int i = arrayList.size()-1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }

    }

}
