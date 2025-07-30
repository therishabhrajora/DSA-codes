import java.util.Stack;

class Queues {
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



    void display(){
        System.out.println(s1);
    }
}

public class QueueUsing2stack {
    public static void main(String[] args) {
        Queues queue=new Queues();
        queue.add(12);
        queue.add(22);
        queue.add(32);
        queue.add(42);
        queue.display();


    }

}
