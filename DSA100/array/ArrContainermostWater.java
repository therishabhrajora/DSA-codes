package DSA100;

public class ArrContainermostWater {
    public static int findMostwater(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int res = 0;
        while (l < r) {
            int water = Math.min(arr[l], arr[r]) * (r - l);
            res = Math.max(res, water);

            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,7,2,9,3,6,4};
        System.out.println(findMostwater(arr));
    }
}
