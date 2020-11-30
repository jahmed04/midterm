package math.problems;

public class MakePyramid {

    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        int n =6;
        pTriangle(n);
    }

    public static void pTriangle(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");       //printing space
            }
            for (int j=0; j<=i; j++ )       //inner loop for number of columns
            {
                System.out.print("* ");     //printing pyramid
            }

            System.out.println();
        }
    }

}
