package Tries;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    static class Node {
        Node arr[] = new Node[26];
        boolean eow = false;
        Node(){
            for (int i=0;i<arr.length;i++){
                arr[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.arr[idx]==null){
                curr.arr[idx] = new Node();
            }
            curr = curr.arr[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr == null || curr.arr[idx] == null) {
                return false;
            }
            curr = curr.arr[idx];
        }
        return curr != null && curr.eow;
    }
    
    public static boolean helper(String str){
        if(str.length()==0){
            return true;
        }
        for (int i=1;i<str.length();i++){
            if (search(str.substring(0,i)) && helper(str.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        for(String x : wordDict){
            insert(x);
        }
        return helper(s);
    }
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("i");
        wordDict.add("like");
        wordDict.add("sam");
        wordDict.add("samsung");
        wordDict.add("mobile");
        wordDict.add("ice");
        System.out.println(wordBreak("ilikesamsung", wordDict));

    }
}
