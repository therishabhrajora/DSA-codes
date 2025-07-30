public class ReverseLL {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    Node head;

    void reverseLL() {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        list.reverseLL();

        System.out.println("\nReversed Linked List:");
        temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
