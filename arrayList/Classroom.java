import java.util.ArrayList;

public class Classroom {
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.out.println(list);

        // reverse Arraylist
        for(int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        } 

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


    }
}
