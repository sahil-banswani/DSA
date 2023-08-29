public class SubArrayOptimalSolution {
    public static void main(String arg[]) {
        int arr[] = {1,-4,3,2,1};
        sumofSubArray(arr);
    }
    public static void sumofSubArray(int arr[]) {
        int n = arr.length;
        int currSum[] = new int [n];
        currSum[0] = 0;

        for(int i=0;i<n;i++) {
            currSum[i] = currSum[i-1] + arr[i-1];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++) {
            int sum=0;
            for(int j=0;j<i;j++) {
                sum = currSum[i] - currSum[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }
}