package javapractice.wrapperclasses;

import java.util.Scanner;

public class WrapperClassTask {

    public static void main(String[] args) {

        /*
            Task: Check for Equal Uppercase and Lowercase Characters.

            Write a program that examines a string and returns true if the total number of uppercase
            characters in the string is equal to the total number of lowercase characters.

            Ex:
                Input String: "JAVA java"

                Output:
                        true
         */

        int countUpper = 0, countLower = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String words = userInput.nextLine();

        for (int i = 0; i < words.length(); i++) {

            char eachChar = words.charAt(i);
            if (Character.isUpperCase(eachChar)) {
                countUpper++;
            } else if (Character.isLowerCase(eachChar)) {
                countLower++;
            }

        }

        System.out.println(countUpper == countLower);
        System.out.println(countUpper);
        System.out.println(countLower);

    }

}
