import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverse(Queue q) {
        Stack<Integer> s1=new Stack<>();
        while(!q.isEmpty()){
            s1.add((Integer) q.remove());
        }

        while(!s1.isEmpty()){
            q.add(s1.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(Arrays.asList(1,2,4,6,5,6,7));
        reverse(q);
          System.out.println("Reversed Queue: " + q);
    }
}
