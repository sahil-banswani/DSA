// check if the given array is sorted using recursion

public class problem1 {
    public static boolean isSort(int arr[],int i) {
        if(i == arr.length -1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSort(arr, i+1);
    }
    // write a function to find the first occurence of an element in an array?
    public static int firstOcc(int arr[], int i, int key) {
        if(i == arr.length) {
            return -1;
        }
        
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, i+1, key);
    }

    public static void main(String[] arg) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOcc(arr, 0, 5));  
    }

}
