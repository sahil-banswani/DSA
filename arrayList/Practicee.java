import java.util.ArrayList;
import java.util.Collections;

public class Practicee {

    public static boolean monoTone(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
        }
        return inc || dec;
    }

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list ) {
        Collections.sort(list);
        ArrayList<Integer> lonely = new ArrayList<>();
        for(int i = 1; i < list.size()-1; i++) {
            if(list.get(i-1) + 1 < list.get(i) && list.get(i) < list.get(i+1)) {
                lonely.add(list.get(i));
            } 
        }
        if(list.size() == 1) {
            lonely.add(list.get(0));
        }
        if(list.size() > 1) {
            if(list.get(0) + 1 < list.get(1)) {
                lonely.add(list.get(0));
            }
            if(list.get(list.size()-2) + 1 < list.get(list.size()-1)) {
                lonely.add(list.get(list.size()-1));
            }
        }
        return lonely;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        
        // System.out.println(monoTone(list));
        System.out.println(lonelyNumbers(list));
    }
}
