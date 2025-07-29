import java.util.Stack;

class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isempty(){
        return s2.isEmpty();
    }

    void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
}

public class QueueUsing2stack {
    public static void main(String[] args) {
        
    }

}
