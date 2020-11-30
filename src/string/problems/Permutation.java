package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        System.out.println("Enter a string or word: ");

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        int n = string.length();
        System.out.println("Permutations of the string are: ");
        stringPermutation(string, 0, n);
    }

    public static String swapString (String a, int i, int j) {

        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;

        return String.valueOf(b);
    }

    public static void stringPermutation (String string, int start, int end) {

        if(start == end-1) {
            System.out.println(string);
        }
        else {

            for(int i = start; i<end; i++) {
                string = swapString(string, start, i);
                stringPermutation(string, start+1, end);
                string = swapString(string,start,i);
            }
        }
    }
}
