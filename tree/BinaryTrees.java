package tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1;

    public static Node buildTree(int[] arr) {
        index++;
        if (index >= arr.length || index == -1) {
            return null;
        }

        Node root = new Node(arr[index]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;

    }

    // traversal preorder;
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // traversal postorder
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // inorder traversal
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // level order traversal
    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if (curNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }

                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lh = height(root.left);
            int rh = height(root.left);
            int height = Math.max(lh, rh) + 1;
            return height;
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        } else {
            int cl = countNodes(root.left);
            int cr = countNodes(root.right);
            int treecount = cl + cr + 1;

            return treecount;
        }
    }

    // diameter of tree(approach 1)

    public static int diameterOftree(Node root) {
        if (root == null) {
            return 0;
        } else {
            int ldia = diameterOftree(root.left);
            int rdia = diameterOftree(root.right);
            int lh = height(root.left);
            int rh = height(root.left);
            int totalheight = lh + rh + 1;
            return Math.max(Math.max(ldia, rdia), totalheight);
        }
    }

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    // diameter of stree approcah 2
    public static Info diameter2(Node root) {//O(n);
        if(root==null){
            return new Info(0,0);
        }

        Info leftdiam = diameter2(root.left);
        Info rightdiam = diameter2(root.right);
        int diam = Math.max(Math.max(leftdiam.diam, rightdiam.diam), leftdiam.ht + rightdiam.ht + 1);
        int ht = Math.max(leftdiam.ht, rightdiam.ht) + 1;

        return new Info(diam, ht);
    }

    // search subtree in a tree

    public static void main(String[] args) {
        int node[] = { 1, 5, 9, 3, 9, -1, -1, 4, 5 };
        Node root = buildTree(node);
        System.out.println("preorder: ");
        preorder(root);
        System.out.println();
        System.out.println("postorder: ");
        postorder(root);
        System.out.println();
        System.out.println("inorder: ");
        inorder(root);
        System.out.println();
        System.out.println("level order");
        levelOrder(root);
        System.out.println();
        System.out.println("height of tree");
        System.out.println(height(root));
        System.out.println("countting  of nodes in tree");
        System.out.println(countNodes(root));

        System.out.println("diameter of tree");
        System.out.println(diameterOftree(root));

        System.out.println("diameter of tree");
        System.out.println(diameter2(root).diam);

    }
}