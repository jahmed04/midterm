package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        System.out.println("PLease enter a word: ");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        if (palindromeCheck(string)) {
            System.out.println("Yes, it's a palindrome!");
        }
        else {
            System.out.println("No, it's not palindrome.");
        }
    }

    public static boolean palindromeCheck (String string) {

        int i =0;
        int j = string.length()-1;

        while (i<j) {

            if(string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
