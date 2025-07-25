public class RotatedSortArraySearch {
    public static int search(int arr[],int tar, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[s]<=mid){
            if(arr[s]<=tar && tar<=arr[mid]){
                return search(arr, tar, s, mid - 1);
            } else {
                return search(arr, tar, mid + 1, e);
            }
        }else{
            if(arr[mid]<=tar && tar<=arr[e]){
                return search(arr, tar, mid + 1, e);
            } else {
                return search(arr, tar, s, mid - 1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        int ans = search(arr, tar, 0, arr.length - 1);
        if(ans == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }
}
