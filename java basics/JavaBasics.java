// import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {   
        System.out.println(multiply(3, 4));
    } 
    static void pattern1(int n) {
        for(int row = 0 ;row <= n; row++) {
            //for every row, run the col
            for(int col =0 ; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int multiply (int n, int m) {
        int product = n*m;
        return product;
    }
}