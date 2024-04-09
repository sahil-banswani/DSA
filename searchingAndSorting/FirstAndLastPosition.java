// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1227577823/
class FirstAndLastPosition{

    public static void main(String[] arg) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr, target);
        System.out.println(ans);
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1}; 
        // check for the first ocuurance of first element.
        ans[0] = search(nums, target, true);
        ans[1]= search(nums, target, false);
        return ans;
    }
    // this function just returns the index value of what we are going to search.
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        
        int start = 0;
        int end = nums.length - 1;
        while (start <= end ) {
            // find the middle element
            // int mid = (start + end) /2; // might be posiible that (start + end) exceed in negative. 
            int mid = start + (end -start) /2;
            if (target < nums[mid]) {
                end = mid-1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                // element found
                ans = mid;
                if(findStartIndex) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
    

