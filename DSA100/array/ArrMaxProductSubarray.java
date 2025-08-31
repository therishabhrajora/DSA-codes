package DSA100;

public class ArrMaxProductSubarray {
    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public static int  min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
    public static int maxproduct(int[] arr){
        int n=arr.length;
        int currmax=arr[0];
        int currmin=arr[0];
        int maxcprod=arr[0];

        for(int i=1; i<n;i++){
            int temp=max(arr[i],arr[i]*currmax,arr[i]*currmin);
            currmin=min(arr[i],arr[i]*currmax,arr[i]*currmin);
            currmax=temp;
            maxcprod=Math.max(maxcprod,currmax);
        }

        return maxcprod;
    }


    public static void main(String[] args) {
        int[] arr={1,2,7};
        System.out.println(maxproduct(arr));

    }

}
