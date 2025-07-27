import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String str){
        Stack<Character> s= new Stack<>();
        int indx=0;
        while(indx<str.length()){
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder res= new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            res.append(curr);
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String str="rishabh";
        String rev=reverse(str);
        System.out.println(rev);
    }
}
