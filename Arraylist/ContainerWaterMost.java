
import java.util.*;

public class ContainerWaterMost {
    // brute force approach
    public static int storeWater(ArrayList<Integer> heights) {
        int maxwater=0;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int ht=Math.min(heights.get(i), heights.get(j));
                int width=j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater, currwater);
            }
        }      
        return maxwater;  
    }

    // two pointer approach
    public static int storeWaterTwoPointer(List<Integer> heights){
        int maxwater=0;
        int lp=0,rp=heights.size()-1;
        while(lp<rp){
            //calculate weater area
            int ht=Math.min(heights.get(rp), heights.get(lp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);
            if(heights.get(lp)<heights.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }

        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        int maxWater = storeWater(heights);
        System.out.println("Maximum water that can be stored: " + maxWater);
    }
}
