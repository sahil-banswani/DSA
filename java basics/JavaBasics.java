// import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        // System.out.print();
        // System.out.println(binomialCoefficient(5,3));
        
        System.out.println(sum(5, 3));
        System.out.println(sum(2,4,6));
    }

    static void pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            // for every row, run the col
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int multiply(int n, int m) {
        int product = n * m;
        return product;
    }

    static void swap(int a, int b) {

        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static int factorial(int n) {
        int fac = n;
        for (int i = n-1; i > 1; i--) {
            fac = fac * i;
        }
        return fac;
    }

    public static int binomialCoefficient(int n, int r) {
        // nCr = n!/(r!(n-r)!)
        int n_fac = factorial(n);
        int r_fac = factorial(r);

        int nmr_fact = n_fac / (r_fac * factorial(n-r));

        return nmr_fact;
    }

    // func to add two numbers
    public static int sum(int a, int b ) {
        return a+b;
    }
    //func to calculate sum of two numbers
    public static int sum(int a, int b , int c) {
        return a+b+c;
    }

}