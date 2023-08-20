import java.util.*;

public class largestOfNumbers {
    public static void main(String arg[] ) {
        int numbers[] = {1,2,1,2,1,4,5,4,5,7,8,5,8,9};
        System.out.println("Smallest value is: "+getSmallest(numbers));
        System.out.println("Largets value is: "+getlargest(numbers));
    }

    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++ ) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++ ) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }


}
