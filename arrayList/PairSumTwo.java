import java.util.ArrayList;

public class PairSumTwo {

    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i + 1;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) > target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(14);
        list.add(19);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 15;
        System.out.println(pairSum1(list, target));
    }
}
