package BinarySearchTrees;

import BinarySearchTrees.RangePrint.Node;

// For a bst to be valid every node in the left should be less than the root and every node in the right should be
// greater than the node
// https://leetcode.com/problems/validate-binary-search-tree/description/
// Mirror a Binary Tree
// https://leetcode.com/problems/invert-binary-tree/description/
public class ValidateBST {
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node Mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = Mirror(root.left);
        Node rightMirror = Mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void main(String[] args) {

    }

}
