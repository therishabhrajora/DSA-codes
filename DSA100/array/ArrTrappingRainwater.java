package DSA100;

public class ArrTrappingRainwater {

    public static int trappedWater(int[] arr){
        int n=arr.length;
        int l=1,r=n-2;
        int lmax=arr[l-1];
        int rmax=arr[r+1];
        int res=0;
        while(l<=r){
            if(rmax<=lmax){
                res=res+Math.max(0,rmax-arr[r]);
                rmax=Math.max(rmax,arr[r]);
                r--;
            }else{
                res=res+Math.max(0,Math.max(0,lmax-arr[l]));
                lmax=Math.max(lmax,arr[l]);
                l++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,6,9,4,0,3,6};
        System.out.println(trappedWater(arr));
    }
}
