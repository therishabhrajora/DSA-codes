package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BottomViewTree {
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
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void bottomview(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        Info info = new Info(root, 0);
        q.add(info);
        q.add(null);
        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {

            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                map.put(curr.hd, curr.node); // Unlike Top View, we overwrite the value at every level

                if (curr.node.left != null) {
                    Info infoleft = new Info(curr.node.left, curr.hd - 1);
                    q.add(infoleft);
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    Info inforight = new Info(curr.node.right, curr.hd + 1);
                    q.add(inforight);
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bottomview(root);
    }
}
