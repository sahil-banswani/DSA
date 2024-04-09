// Q. find the ceiling of the target element in an array. (celing means smallest number greater than = target element).
// Q. fianl the floor of the target element in an array. (floor means greatest number smaller than = target element).

class binarySearch {
    public static void main(String[] arg) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingOfANumber(arr, target);
        System.out.println(ans);
    }

    public static ceilingOfANumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end ) {
            // find the middle element
            // int mid = (start + end) /2; // might be posiible that (start + end) exceed in negative. 
            int mid = start + (end -start) /2;

            if (tartget < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } elae {
                // element found
                return mid;
            }
        }
        return start;
    }
    public static floorOfANumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end ) {
            // find the middle element
            // int mid = (start + end) /2; // might be posiible that (start + end) exceed in negative. 
            int mid = start + (end -start) /2;

            if (tartget < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } elae {
                // element found
                return mid;
            }
        }
        return end;
    }
}