package BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

/*
 * We have to delete a specific node. There are multiple cases
 * 1) Case 1: Leaf Node
 * 2) Case 2: Node with single child
 * 3) Case 3: Node with 2 child Nodes
 * For the Case 3 remen=mber that : INORDER SUCCESSOR --> LEFTMOST NODE OF RIGHT TREE
 */
public class Deletion {
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

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data < value) {
            root.right = insert(root.right, value);
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        }
        return root;
    }

    public static void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else { // the case where we find the node
                 // case 1 : leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 : single child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // case 3 : both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int nums : arr) {
            root = insert(root, nums);
        }
        inorder(root);
        System.out.println();
        LevelOrder(root);
        delete(root, 5);
        System.out.println();
        inorder(root);
        System.out.println();
        LevelOrder(root);
    }
}
