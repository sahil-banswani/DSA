

public class ArrayChallenge1 {
    public static void main(String[] arg) {
        int arr[] = {10,7,4,6,8,10,11};
        System.out.println(longestArithmaticSubarray(arr));
    }

    // Max till ith element
    public static int maxTillI(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i+1] > arr[i]) {
                max = arr[i+1];
            }
        }
        return max;
    }
    public static int sumOfAllSubarray(int arr[]) {
        int currentSum = 0;
        for(int i=0;i<arr.length-1; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i;k<=j;k++ ) {
                    currentSum += arr[k]; 
                }
            }
        }
        return currentSum;
    }
    public static int longestArithmaticSubarray(int arr[]) {
        int ans = 2;
        int pd = arr[1] - arr[0];
        int curr = 2;
        int j = 2;

        while(j<arr.length) {
            if(pd == arr[j] - arr[j-1]) {
                curr++;
            }
            else {
                pd = arr[j] - arr[j-1];
                curr = 2;
            }
            ans = Math.max(ans,curr);
            j++;
        }
        return ans;
    }
}
