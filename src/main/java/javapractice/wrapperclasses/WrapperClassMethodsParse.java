package javapractice.wrapperclasses;

public class WrapperClassMethodsParse {

    public static void main(String[] args) {

        String str = "12";
        System.out.println(str + 1);

        int a = Integer.parseInt(str);

        System.out.println(a);
        System.out.println(a + 1);

        String str2 = "0.5";
        System.out.println(1 + str2);

        double d = Double.parseDouble(str2);
        System.out.println(d + 1);

    }

}
