package DSA100;

public class ArrSearchInRotatedandSortedArray {
    public static boolean search(int[] arr,int target){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr={5,7,8,9,1,2,3,4};
        int tar=5;
        System.out.println(search(arr, tar));
    }
}
