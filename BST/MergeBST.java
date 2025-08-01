package BST;

import java.util.ArrayList;

public class MergeBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int en) {
        if (st > en) {
            return null;
        }

        int mid = (st + en) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, en);

        return root;

    }

    public static Node merge(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> finalarr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                finalarr.add(arr1.get(i++));
                
            } else {
                finalarr.add(arr2.get(j++));
                
            }
        }

        while (i < arr1.size()) {
            finalarr.add(arr1.get(i++));
            
        }

        while (j < arr2.size()) {
            finalarr.add(arr2.get(j++));
            
        }

        return createBST(finalarr, 0, finalarr.size() - 1);

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(8);
        root1.left = new Node(5);
        root1.right = new Node(10);
        root1.left.left = new Node(3);
        root1.left.right = new Node(6);
        root1.right.right = new Node(11);

        Node root2 = new Node(5);
        root2.left = new Node(2);
        root2.right = new Node(10);
        root2.left.left = new Node(1);
        root2.left.right = new Node(4);
        root2.right.right = new Node(11);

        Node mergedRoot = merge(root1, root2);
        preorder(mergedRoot);

    }

}
