class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLL {
    static Node head;
    static Node tail;

    public static void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    public static void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        addFirst(10);
        addFirst(20);
        // addFirst(30);
        addLast(60);

        print();
    }
}
