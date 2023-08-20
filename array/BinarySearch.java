public class BinarySearch {
    public static void main(String arg[]) {
        int numbers[] = {2,5,6,8,9,10,45,88};
        int key = 88;
        System.out.println("Index for key is: "+binarySearch(numbers, key)+1);
    }

    public static int binarySearch(int numbers[],int key) {
        int start = 0;
        int end = numbers.length - 1; 
        while(start <= end ) {
            int mid = (start + end) / 2;
            if(numbers[mid] == key) {
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
