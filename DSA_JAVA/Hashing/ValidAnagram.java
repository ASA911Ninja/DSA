package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int k = 0;k <s.length();k++){
            char i = s.charAt(k);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int k = 0;k <t.length();k++){
            char i = t.charAt(k);
            if (map.containsKey(i)){
                if (map.get(i)==1){
                    map.remove(i);
                } else{
                    map.put(i,map.get(i)-1);
                }
            }
        }
        return map.isEmpty();

    }
    public static void main(String[] args) {
        String s = "care";
        String t = "raci";
        System.out.println(isAnagram(s, t));
    }
}
