// https://leetcode.com/problems/find-peak-element/description/
// Q. Find the peak of an mountain array.
class peakElementInArray{

    public static void main(String[] arg) {
        int[] arr = {1,2,3,5,6,4,3,2};
        findindexofPeakElement(arr);
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
}