package DSA100 ;
import java.util.Arrays;

public class ArrPairSum {

    //brute force
    public static boolean twoSum(int[] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //optimised
    public static boolean twoSumOptimised(int[] arr, int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[right]+arr[left];
            if(target==sum){
                return true;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
      
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");

        if (twoSum(arr, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}