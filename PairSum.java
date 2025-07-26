import java.util.List;

public class PairSum {
    public static void pairSum(List<Integer> list,int target) {
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
                    return;
                }
            }
        }
    }

    //two pointer approach
    public static boolean twoPointerAppoachPairSum(List<Integer> list, int target){
        int lp=0,rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int target = 6;
        pairSum(list, target);
    }
}
