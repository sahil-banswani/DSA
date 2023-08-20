
public class Patterns {
    public static void main(String arg[]) {
        // hollow_patterns(4,5);
        // inverted_pyramids(4);
        // inverted_half_pyramid_numbers(5);
        // floyd_triangle(5);
        // isEven(5);
        // ZeroOnetriangle(5);
        // butterfly(4);
        // solid_rhombus(5);
        diamond(4);
    }

    public static void hollow_patterns(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_pyramids(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_numbers(int n) {
        for( int i = 1; i<= n; i++){
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int count = 1;
        for( int i = 1; i<= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void ZeroOnetriangle(int n) {
        for( int i = 1; i<= n; i++){
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) { 
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isEven(int i) {
        return false;
    }

    private static void butterfly(int n) {
        for( int i=0; i<= n; i++ ) {
            for(int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < 2*(n-i) ; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for( int i=n; i >= 1; i-- ) {
            for(int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < 2*(n-i) ; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void solid_rhombus(int n) {
        for(int i = 0; i<n; i++) {
            //spaces
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for(int i=0;i<n;i++) {
            for(int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for(int j =0; j < 2*i +1; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--) {
            for(int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for(int j=0; j < 2*i +1; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
