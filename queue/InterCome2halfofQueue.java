import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class InterCome2halfofQueue {
    static void interleave(Queue<Integer> q) {
        Queue<Integer> halfqueue = new LinkedList<>();
        for (int i = 0; i <=q.size()/2; i++) {
            halfqueue.add(q.remove());
        }
        while (!halfqueue.isEmpty()) {
            q.add(halfqueue.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10));
        interleave(q);
        System.out.println(q);
    }

}
