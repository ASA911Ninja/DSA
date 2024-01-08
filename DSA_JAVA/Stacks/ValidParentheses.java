package Stacks;

import java.util.Stack;
// https://leetcode.com/problems/valid-parentheses/solutions/4108189/java-easy-and-most-intuitive-approach/?submissionId=1062821454
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));

    }

    public static boolean isOpp(char x, char y) {

        if (x == '[' && y == ']') {
            return true;
        }
        if (x == '(' && y == ')') {
            return true;
        }
        if (x == '{' && y == '}') {
            return true;
        }
        return false;

    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        // s.push(str.charAt(0));
        boolean flag = false;
        for (int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if (s.isEmpty()){
                s.push(x);
                continue;
            }
            if (isOpp(s.peek(), x)){
                s.pop();
                flag = true;
            }
            s.push(x);
            if (flag){
                s.pop();
                flag=false;
            }
        }
        return s.isEmpty();

    }
}
