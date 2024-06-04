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

    // write a function to find the last occurence of an element in an array?
    public static int lastOcc(int arr[], int i, int key) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, i+1, key);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] arg) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOcc(arr, 0, 5));  
    }

}
