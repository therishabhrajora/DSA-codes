public class TillingProblem {
    public static int tiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        //verticle choice
        int verticle=tiles(n-1);
        int horizontal=tiles(n-2);
        return verticle + horizontal;
    }
    public static void main(String[] args) {
        int n=3; //length of the wall
        int ways=tiles(n);
        System.out.println("Number of ways to fill the wall: " + ways);
    }
}
