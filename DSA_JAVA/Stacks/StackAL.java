package Stacks;

import java.util.ArrayList;

public class StackAL {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());

        s.push(1);
        s.push(7);
        s.push(11);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
