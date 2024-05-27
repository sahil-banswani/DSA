
public class RecurssionBasics {

    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printAsc(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        printAsc(n-1);
        System.out.print(" " + n );
    }

    public static int Factorial(int n) {
        if(n==0) {
            return 1;
        }
        int fn = n * Factorial(n-1);
        return fn;
    }

    public static void main(String arg[]) {
        int n = 5;
        // printDec(n);
        // printAsc(n);

        System.out.println(Factorial(n));
    }
}