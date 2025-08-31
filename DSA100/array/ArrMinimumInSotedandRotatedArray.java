package DSA100;

public class ArrMinimumInSotedandRotatedArray {

    public static int minimum(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] < arr[right]) {
                return arr[left];
            }

            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        return arr[left];

    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 1, 2, 3, 4, 6 };
        System.out.println(minimum(arr));
    }
}
