public class BinnaryStringProblem {
    public static void binnaryStringProblem(int n, int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        binnaryStringProblem(n-1, 0, str+"0");
        if(lastPlace==0){
            binnaryStringProblem(n-1, 1, str+"1");
        }
    }

    
    public static void main(String[] args) {
        int n=3; //length of the binary string
        System.out.println("Binary strings of length " + n + " with no consecutive 1s:");
        binnaryStringProblem(n, 0, "");
    }
}
