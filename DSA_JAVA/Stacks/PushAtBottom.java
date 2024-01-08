package Stacks;
import java.util.Stack;
public class PushAtBottom {
    public static void pushBottom(Stack<Integer> s,int val){
        if (s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        pushBottom(s, val);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i=0;i<5;i++){
            s.push(100+i);
        }
        pushBottom(s, 123);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
