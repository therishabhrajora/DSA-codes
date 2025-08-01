package BST;

public class SizeOfLargestBst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        boolean isbst;
        int size;
        int min;
        int max;

        public Info(boolean isbst, int size, int min, int max) {
            this.isbst = isbst;
            this.size = size;
            this.min = min;
            this.max = max;
        }

    }

    public static int maxBST = 0;

    public static Info largest(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        Info leftInfo = largest(root.left);
        Info rightInfo = largest(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isbst && rightInfo.isbst) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);

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

        System.out.println(largest(root).size);
    }

}
