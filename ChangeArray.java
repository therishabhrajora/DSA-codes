public class ChangeArray {
    public static int[] chnageArray(int arr[],int i, int val){
        if(i==arr.length){
            
            return arr;
        }
        arr[i]=val;
        chnageArray(arr,i+1, val+1);
        arr[i]=arr[i]-2;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,5,7,4,7,9,2,10};
        int[] arrs=chnageArray(arr, 0, 0);
        for(int val:arrs){
            System.out.print(val + " ");
        }
    }
}
