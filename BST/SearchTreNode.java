package BST;
public class SearchTreNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean searchNode(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return searchNode(root.left, key);
        }

        if (root.data < key) {
            return searchNode(root.right, key);
        }

        return false;
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
        System.out.println(searchNode(root, 15));
    }
}
