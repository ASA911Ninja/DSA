package BinarySearchTrees;

public class BST {
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

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // insert in left Subtree
            root.left = insert(root.left, val);
        } else {
            // root.data<val --> Insert in Right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean BSTSearch(Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        if (root.data < key){
            return BSTSearch(root.right, key);
        }
        else{
            return BSTSearch(root.left, key);
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static int binsearch(int arr[], int key, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si) - (si - ei) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[mid] > key) {
            return binsearch(arr, key, si, mid - 1);
        } else {
            return binsearch(arr, key, mid + 1, ei);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int nums : arr) {
            root = insert(root, nums);
        }
        inorder(root);
        System.out.println();
        int arr2[] = { 1, 2, 11, 13, 33, 43, 46 };
        System.out.println(binsearch(arr2, 4, 0, arr2.length - 1));
        System.out.println(BSTSearch(root, 6));
    }
}
