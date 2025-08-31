package DSA100;

import java.util.ArrayList;
import java.util.List;

public class ArrFindtriplets {
    public static List<List<Integer>> triplets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplets = new ArrayList<>();
                        triplets.add(arr[i]);
                        triplets.add(arr[j]);
                        triplets.add(arr[k]);
                        result.add(triplets);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 5, 9, 4, -6, -5, -5 };
        System.out.println(triplets(arr));
    }
}
