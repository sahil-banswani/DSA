// import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        // System.out.print();
        swap();
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

    static void swap() {
        int a = 5;
        int b = 10;
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}