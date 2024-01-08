package Stacks;

import java.util.Stack;

public class Reverse {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
    public static void StackRev(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        StackRev(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(100);
        System.out.println(s);
        StackRev(s);;
        System.out.println(s);
    }
}
