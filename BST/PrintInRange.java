package BST;

public class PrintInRange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printrange(root.right, k1, k2);
        } else if (root.data < k1) {
            printrange(root.left, k1, k2);
        } else {
            printrange(root.right, k1, k2);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.left.right = new Node(4);
        root.left.left.right = new Node(4);
        root.right.right.right = new Node(14);
        printrange(root, 10, 14);
    }

}
