import java.util.Scanner;

class Matrices {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements: ");
        arrayInput(arr, n);
        arrayOutput(arr, n);
    }

    public static void arrayInput(int arr[][], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void arrayOutput(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}