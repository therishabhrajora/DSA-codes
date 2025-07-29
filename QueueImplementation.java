class Nodes {
    int arr[];
    int front;
    int rear;
    int size;

    Nodes(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;

    }

    boolean isEmpty() {
        return rear == -1;
    }

    void enqueue(int data) {
        // full queue
        if (rear == size - 1) {
            System.out.println("full");
        }

        rear = rear + 1;
        arr[rear] = data;
    }

    int dequeue() {
        //
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear = rear - 1;
        return front;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        }
        return arr[0];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        } else {
            int i = front;
            while (true) {
                System.out.println(arr[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % size;
            }

            System.out.println();
        }
    }

}

// implementation using array
public class QueueImplementation {
    public static void main(String[] args) {
        Nodes q = new Nodes(5);

        q.enqueue(10);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        // should give "Queue is full"
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
