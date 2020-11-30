package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int iterationValue = 1;

        // Iteration
        for (int i = 1; i<= num; i++) {
            iterationValue = iterationValue*i;
        }
        System.out.println("Factorial (iteration): " + iterationValue);

        // recursion
        int recursionValue = factorial(num);
        System.out.println("Factorial (recursion): " + recursionValue);

    }

    //recursion factorial logic
    public static int factorial (int num) {

        if (num >= 1){
            return num*factorial (num-1);
        }
        else{
            return 1;
        }

    }


}
