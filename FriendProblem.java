public class FriendProblem {
    public static int friendProblem(int n){
        if(n==1 || n==2){
            return n;
        }

        return friendProblem(n-1)+(n-1)*friendProblem(n-2);

    }
    public static void main(String[] args) {
        int n=3; //number of friends
        int ways=friendProblem(n);
        System.out.println("Number of ways friends can pair: " + ways);
    }
}
