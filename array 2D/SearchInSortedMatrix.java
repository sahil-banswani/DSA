public class SearchInSortedMatrix {
    public static void main(String[] arg) {
        int matrice[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 },
        };
        int key = 39;
        stairecaseSearch(matrice, key);
    }

    public static boolean stairecaseSearch(int matrix[][], int key) {
        int row=0,col = matrix[0].length - 1;
        while (row < matrix.length && col > 0) {
            if (matrix[row][col] == key) {
                System.out.println("Foumd Key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
                return true;
            } else {
                row++;
                
                return true;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }
}
