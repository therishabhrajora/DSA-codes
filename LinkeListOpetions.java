import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkeListOpetions {
    Node head = null;
    Node tail = null;
    int size = 0;

    int getSize() {
        return size;
    }

    void addhead(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    void addtail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void addAt(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addhead(data);
            return;
        }
        if (index == size) {
            addtail(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int idx = 0;
        while (idx < index - 1) {
            temp = temp.next;
            idx++;
        }

        temp.next = newNode;
        newNode.next = temp.next.next;
        size++;
    }

    void deleteHead() {
        if (head == null || head.next == null) {
            head = tail = null;
        } else {

            head = head.next;
        }
        size--;
    }

    void deleteTail() {
        if (head == null || head.next == null) {
            head = tail = null;
            size = 0;
            return;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
        size--;
    }

    void deleteAt(int index) {
        if (head == null || head.next == null) {
            System.out.println("List is empty");
            return;
        } else {

            int idx = 0;
            Node temp = head;
            while (idx < index - 1) {
                temp = temp.next;
                idx++;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkeListOpetions ll = new LinkeListOpetions();
        ll.addhead(10);
        ll.addtail(20);
        System.out.println(ll.getSize());

        ll.addAt(15, 1);
        ll.addAt(5, 0);
        ll.addAt(25, 3);
        System.out.println(ll.getSize());

        System.out.println("Linked List after additions:");
        ll.printList();
        System.out.println("Size of linked list: " + ll.getSize());
        ll.deleteAt(2);
        ll.deleteHead();
        ll.deleteTail();
        ll.deleteAt(1);
        System.out.println("Linked List after deletions:");
        ll.printList();
        System.out.println("Size of linked list after deletions: " + ll.getSize());

    }
}
