
public class Sorting {
    public static void main(String[] arg) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }

    public static void bubbleSorting(int arr[]) {
        for(int turn = 0; turn < arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1] ) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[] ) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1 ;j<arr.length ;j++) {
                if(arr[minPos] > arr[j] ) {
                    minPos = j; 
                }
            }
            //swap 
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length-1;i++) {
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[prev] > arr[curr]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
