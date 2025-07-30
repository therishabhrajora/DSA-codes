public class CheckPalindromeLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void checkPalindrome() {
        if (head == null || head.next == null) {
            System.out.println("Palindrome");
            return;
        } else {
            Node midNode = findMid(head);
            Node curr = midNode;
            Node pre = null;
            Node next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }

            head = pre;

            Node right = pre;
            Node left = head;
            while (right != null) {
                if (left.data != right.data) {
                    System.out.println("Not a Palindrome");
                    return;
                } else {
                    left = left.next;
                    right = right.next;
                }
            }
            System.out.println("Palindrome");
        }

    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Checking if the linked list is a palindrome:");
        checkPalindrome();
    }
}
