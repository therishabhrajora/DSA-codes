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
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("full");
        }
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("empty");
        }
        int res = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return res;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("empty");
            return -1;
        }

        return arr[front];

    }
}

public class QueueCircularImplementation {

}
