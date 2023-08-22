
public class MaximumSubarray {
    public static void main(String arg[]){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray(numbers);
    }
    public static void maxSubarray(int arrays[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                for (int k = i; k <= j; k++) { //print
                    currentSum += arrays[k];
                    // System.out.print(arrays[k] + " ");
                }
                System.out.println(currentSum);
                if(maxSum < currentSum) {
                    maxSum = currentSum; 
                }
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }
}


