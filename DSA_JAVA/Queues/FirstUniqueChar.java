package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "aabcxcb";
        firstNonRepeating(str);
        
    }

    public static void firstNonRepeating(String str){ // Time -> O(n), Space -> O(2n)
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }

        }
        if (q.isEmpty()){
            System.out.println(-1+" ");
        } else{
            System.out.println(q.peek()+" ");
        }
    }

    public int firstUniqChar(String s) { // O(2n)
        int freq[] = new int[26];
        for (int i=0;i<s.length();i++){
            freq[(int)s.charAt(i)-(int)'a']++;
        }
        
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (freq[(int)ch-(int)'a']==1){
                return i;
            }
        }
        return -1;
    }

}
