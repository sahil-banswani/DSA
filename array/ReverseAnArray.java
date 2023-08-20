public class ReverseAnArray {
    public static void main(String arg[]) {
        int numbers[] = {1,5,4,7,8,5,5,99,56,45,25};
        revreseArray(numbers);
        for(int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }
    }
    public static int revreseArray(int numbers[]) {
        int start = 0;
        int end = numbers.length -1;

        while(start < end ) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
        return -1;
    }
}
