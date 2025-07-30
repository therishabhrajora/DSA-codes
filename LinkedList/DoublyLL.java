public class DoublyLL {
    static class NodeDll {
        int data;
        NodeDll next;
        NodeDll prev;

        NodeDll(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static NodeDll head;
    static NodeDll tail;

    public static void addFirst(int data) {
        NodeDll newnode = new NodeDll(data);
        if (head == null) {
            head = tail = newnode;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    public static void addLast(int data) {
        NodeDll newnode = new NodeDll(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public static void print() {
        NodeDll temp = head;
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
