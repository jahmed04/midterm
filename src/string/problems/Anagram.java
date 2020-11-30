package string.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String string1 = sc.nextLine();

        System.out.println("Enter the second word: ");
        String string2 = sc.nextLine();

        if (string1.length() == string2.length()) {

            char[] cArray1 = string1.toCharArray();
            char[] cArray2 = string2.toCharArray();

            Arrays.sort(cArray1);
            Arrays.sort(cArray1);

            boolean anagram = Arrays.equals(cArray1, cArray2);

            if(anagram) {
                System.out.println(string1+" and "+string2+" are anagram.");
            }
            else {
                System.out.println(string1+" and "+string2+" are not anagram.");
            }
        }
        else {
            System.out.println(string1+" and "+string2+" are not anagram.");
        }

        sc.close();
    }
}
