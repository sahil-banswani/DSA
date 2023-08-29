
class SpiralMatrix {
    public static void main(String[] arg) {
        int matrice[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        spiralMatrices(matrice); 
    }

    public static void spiralMatrices(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // right
            for (int j = startRow + 1; j <= endRow - 1; j++) {
                System.out.print(arr[j][endCol] + " ");
            }
            // end row
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }
            // first col
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                System.out.print(arr[j][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
}