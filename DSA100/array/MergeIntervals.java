package DSA100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static List<int[]> merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> res = new ArrayList<>();
     
        res.add(new int[] { arr[0][0], arr[0][1] });


        for (int i = 0; i < arr.length; i++) {
            int[] last = res.get(res.size() - 1);
            int[] curr = arr[i];

            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);

            } else {
                res.add(new int[] { curr[0], curr[1] });
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] arr = { { 7, 8,10 }, { 1, 5,6 }, { 2, 4,8 }, { 4, 6,7 } };
        List<int[]> res = merge(arr);

        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }

    }
}
