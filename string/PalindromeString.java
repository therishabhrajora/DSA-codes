public class PalindromeString {
    public static void main(String[] args) {
        String str="NooN";
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
