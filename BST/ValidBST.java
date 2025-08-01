package BST;


public class ValidBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if ((min != null && root.data <= min.data) || (max != null && root.data >= max.data)) {
            return false;
        }

        boolean validLeft = isValid(root.left, min, root);
        boolean validright = isValid(root.right, root, max);
        return validLeft && validright;
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
        System.out.println(isValid(root, null, null));

    }
}
