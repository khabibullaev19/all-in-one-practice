package javapractice.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRemoveIf {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,3,4,2,4,5,63,2,76,2,4,5,6,7,8,9,10,34,1));
        System.out.println(arrayList);

//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) < 4){
//                arrayList.remove(i);
//            }
//        }
//        System.out.println(arrayList);

        arrayList.removeIf(p -> p < 4);
        System.out.println(arrayList);

    }

}
