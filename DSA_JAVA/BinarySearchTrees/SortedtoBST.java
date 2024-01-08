package BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

// Given a sorted array, create a sorted BST
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// To convert an bst into a balanced bst we first get the sorted array by storing the inorder sequence
// and convert it into a balanced bst
// https://leetcode.com/problems/balance-a-binary-search-tree/description/
public class SortedtoBST {
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

    public static Node createBST(int arr[], int si, int ei) {
        if (si>ei){
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, si, mid - 1);
        root.right = createBST(arr, mid + 1, ei);

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

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = createBST(arr, 0, arr.length-1);
        LevelOrder(root);
    }
}
