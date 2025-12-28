package javapractice.arrays;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        String[] array = {"Cydeo", "Java", "Wooden Spoon"};

        // array.fori
        for(int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i] + " | ");
        }

        System.out.println();

        // array.for
        for (String each : array) {
            System.out.print(each + " | ");
        }

        System.out.println();

        // reversed order (array2.forr)
        String[] array2 = {"Ruby", "Java", "Python", "C#"};
        for (int i = array2.length-1; i >= 0; i--) {
            System.out.print(array2[i] + " | ");
        }

    }

}
