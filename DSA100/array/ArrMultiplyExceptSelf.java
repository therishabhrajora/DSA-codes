package DSA100;

import java.util.Arrays;

public class ArrMultiplyExceptSelf {
    public static int[] productExceptSelf(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res, 1);

        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            if(i!=j){
                res[i]=res[i]*arr[j];
            }
           }
        }

        for(Integer num:res){
            System.out.println(num);
        }

        return res;


    }

    public static void main(String[] args) {
        int[] arr={1,12};
        productExceptSelf(arr);
    }

}
