package Tries;

public class UniqueSubstrings {
    static class Node {
        Node arr[] = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i=0;i<arr.length;i++){
                arr[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.arr[idx]==null){
                curr.arr[idx] = new Node();
            }
            curr = curr.arr[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.arr[idx]==null){
                return false;
            }
            curr = curr.arr[idx];
        }
        return true;
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<root.arr.length;i++){
            if(root.arr[i]!=null){
                count+=countNodes(root.arr[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str = "a"; // ans = 10
        // find all suffixes and insert them in trie
        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }
        System.out.println(countNodes(root)-1);
    }

}
