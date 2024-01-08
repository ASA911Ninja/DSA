package BinarySearchTrees;

import java.util.ArrayList;

// 
public class MergeBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root,ArrayList<Integer> al){
        if (root==null){
            return;
        }
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
    public static Node createBST(ArrayList<Integer> al,int si,int ei){
        if (si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(al.get(mid));
        root.left = createBST(al, si, mid-1);
        root.right = createBST(al, mid+1, ei);
        return root;
    }
    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        inorder(root1, al1);
        inorder(root2, al2);
        
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i=0,j=0;
        while(i<al1.size() && j<al2.size()){
            if (al1.get(i)<=al2.get(j)){
                finalarr.add(al1.get(i));
                i++;
            } else{
                finalarr.add(al2.get(j));
                j++;
            }
        }
        while(i<al1.size()){
            finalarr.add(al1.get(i));
            i++;
        }
        while(j<al2.size()){
            finalarr.add(al2.get(j));
            j++;
        }
        return createBST(finalarr, 0, finalarr.size()-1);
    }
    public static void preorder(Node root){
        if (root!=null){
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(9);
        root1.left = new Node(3);
        root1.right = new Node(12);

        Node root2 = new Node(2);
        root2.left = new Node(1);
        root2.right = new Node(4);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
