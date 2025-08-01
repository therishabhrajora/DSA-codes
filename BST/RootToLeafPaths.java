package BST;

import java.util.ArrayList;

public class RootToLeafPaths {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }

        System.out.println("null");
    }

    public static void printLeafPath(Node root, ArrayList<Integer> path) {
        if(root==null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printLeafPath(root.left, path);
        printLeafPath(root.right, path);
        path.remove(path.size() - 1);
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

        ArrayList<Integer> paths=new ArrayList<>();
        printLeafPath(root, paths);

    }
}
