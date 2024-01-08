package Stacks;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/expression-contains-redundant-bracket-or-not/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
public class DuplicateParentheses {
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str));
    }
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            
            if (c==')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if (count <1){
                    return true;
                } else{
                    s.pop();
                }
            } else {
                s.push(c);
            }
        }
        return false;
    } 
}
