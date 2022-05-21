package math.problems;

import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int n= 40;

        int first= 0;
        int second= 1;
        int fib;

        System.out.print(first+" "+second);

        for(int i=3; i<=n; i++) {

            fib= first + second;
            System.out.print(" "+ fib);

            first= second;
            second = fib;


        }


    }

    public static List<Integer> fibonacci() {
        return null;
    }
}
