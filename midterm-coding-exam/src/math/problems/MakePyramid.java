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

                int row, col,j, n=6;

             for(row = 1; row<=n; row++)
                {


                    for (col =n-1; col>=row; col--)
                    {
                        System.out.print(" ");
                    }

                    for (j=1; j<=row;j++)
                    {
                        System.out.print("* ");
                    }

                    System.out.println();
                }

            }

    public static int pyramid() {
        return 0;
    }
}



