import java.util.Stack;

public class PushAtBottom {
    public static void pushTobottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushTobottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        pushTobottom(s, 10);
        System.out.println(s);  
    }
}
