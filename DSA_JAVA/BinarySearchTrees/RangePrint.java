package BinarySearchTrees;

import java.util.ArrayList;

/*
 * 1) Print all nodes in the rage of 2 numbers
 * 2) Print all paths from root node to leaf node
 */
public class RangePrint {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        
        if (root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void PrintInRange(Node root,int k1,int k2){
        if (root == null){
            return;
        }
        if (root.data >=k1 && root.data<=k2){
            System.out.print(root.data+"  ");
        }
        PrintInRange(root.left, k1, k2);
        PrintInRange(root.right, k1, k2);
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+"  ");
            inorder(root.right);
        }
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right == null){
            System.out.println(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int nums : arr){
            root = insert(root, nums);
        }
        // inorder(root);
        // PrintInRange(root, 5, 12);
        // System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}
