import java.util.ArrayList;
import java.util.List;

public class Overlap {

    public static List<Integer> overlap(int[][] arr1, int[][] arr2) {
        List<Integer> merged = new ArrayList<>();
        if (arr1.length == 0 || arr2.length == 0) {
            return merged;
        }

        int[] lastRowArr1 = arr1[arr1.length - 1];
        int[] firstRowArr2 = arr2[0];

        // Example logic: add first element of last row of arr1 and last element of first row of arr2
        if (lastRowArr1.length > 0 && firstRowArr2.length > 0 && lastRowArr1[lastRowArr1.length - 1] > firstRowArr2[0]) {
            merged.add(lastRowArr1[0]);
            merged.add(firstRowArr2[firstRowArr2.length - 1]);
        }

        return merged;
    }

    public static void main(String[] args) {
        int[][] arr1 = { {1, 6}, {5, 7} };
        int[][] arr2 = { {2, 4}, {3, 8} };

        System.out.println(overlap(arr1, arr2));
    }
}
