package DSA100;

public class ArrBestTimeToBuyAndSell {
    public static int maxProfit(int arr[]) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, arr[j] - arr[i]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 2, 8, 1, 8, 10, 5, 7, 9 };
        int maxProfit = maxProfit(arr);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
