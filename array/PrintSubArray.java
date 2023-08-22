public class PrintSubArray {
    public static void main(String arg[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArray(numbers);
    }

    public static void printSubArray(int arrays[]) {
        int ts = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) { //print
                    sum += arrays[k];
                    System.out.print(arrays[k] + " ");
                }
                System.out.println();
                ts++;
                System.out.println("The sum of SubArray is : "+ sum);
            }
            System.out.println();
        }
        System.out.println("Total subarrays is: "+ts);
    }

}
