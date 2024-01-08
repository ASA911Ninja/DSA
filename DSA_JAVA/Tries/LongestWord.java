package Tries;

public class LongestWord {
    // logic -> we have to find the longest word where all characters have eow = true
    static class Node {
        Node arr[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.arr[idx] == null) {
                curr.arr[idx] = new Node();
            }
            curr = curr.arr[idx];
        }
        curr.eow = true;
    }

    static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.arr.length; i++) {
            if (root.arr[i] != null && root.arr[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.arr[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "ap", "app", "appl", "banana", "apply" }; // ans = apple
        // apple is correct becoz all prefixes such as a,ap,app,appl and apple are
        // present in words
        // with the same logic apply is also correct however the answer must have the
        // lowest lexicographic order
        // to get the lexicographically highest prefix reverse the loop from 25 to 0
        for (String s : words) {
            insert(s);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println("this is the prefix: " + ans);

    }
}
