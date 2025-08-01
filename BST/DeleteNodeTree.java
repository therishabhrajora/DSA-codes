package BST;

public class DeleteNodeTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deleteleaf(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key && root.left == null && root.right == null) {
            return null;
        }
        root.left = deleteleaf(root.left, key);
        root.right = deleteleaf(root.right, key);
        return root;
    }

    public static Node findInorderSucceccor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.data < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.left == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node IS = findInorderSucceccor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);

        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

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
        deleteleaf(root, 14);
        inorder(root);
        System.out.println();
        deleteNode(root, 1);
        inorder(root);
    }

}
