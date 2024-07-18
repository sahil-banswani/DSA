import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

    public static void swap(ArrayList<Integer> list, int idx1,int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);         
        
    }
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(95);
        list.add(12);
        list.add(85);
        list.add(56);

        // swap(list, 1, 3);

        Collections.sort(list);
        Collections.
        System.out.println(list);

        // reverse Arraylist
        // for(int i = list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // } 

        // Add element
        // list.add(1, 9); // O(n)

        // // Get Operations - O(1)
        // System.out.println(list.get(2));

        // // Delete elemenet - O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set element at index - O(n)
        // list.set(2, 20);
        // System.out.println(list);//

        // // Contains element - O(n)
        // System.out.println(list.contains(3));
        // System.out.println(list.contains(11));

        // swap elements
        


    }
}
