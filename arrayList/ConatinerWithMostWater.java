// For a given n lines on x-axis, use 2 lines to form a container such that it holds maximum water

import java.util.ArrayList;

public class ConatinerWithMostWater {

    public static int storedWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i = 0; i<height.size(); i++) {
            for(int j = 0; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-1;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater); 
            }
        }
        return maxWater;
    } // O(n^2)

    public static int storeWater(ArrayList<Integer> height) {
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        storedWater(list);
        System.out.println(storedWater(list));
    }
}
