import java.util.*;

public class PairSumInSortedRotatedList {
    public static void pairSum(List<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.print(String.format("(twoa nos are %d and %d)", list.get(lp), list.get(rp)));
                return;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        pairSum(list, 26);

    }
}
