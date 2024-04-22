// https://leetcode.com/problems/find-in-mountain-array/

class searchInMountian {
    public static void main(String[] arg) {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;

    }

    int search (int arr[], int target) {
        int peak = findindexofPeakElement(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return binarySearch(arr, target, peak+1, arr.length -1);
    }

    static int findindexofPeakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]) {
                //you are the dec part of the array, this may be the ans, but look left, this is why end != mid - 1
                start = mid + 1; // checking right hand side. "start mid(mid+1) end "
            } else {
                // you are in the asc part of the array
                end = mid; // checking lefthand side." start mid end"
            }
        }

        // in the end , start == end and the pointing to the largest number because of these 2 checks above
        // start and end are always trying to find max element in the above 2 chwecks 
        // hence, when they are pointing to just omne element tht is the max one because of the abpve line
        return start;
    }

    public static int binarySearch(int arr[], int target ,int start, int end) {
        while (start <= end ) {
            // find the middle element
            // int mid = (start + end) /2; // might be posiible that (start + end) exceed in negative. 
            int mid = start + (end -start) /2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                // element found
                return mid;
            }
        }
        return arr[start];
    }
}