package Stacks;

public class StackLL {
    static class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head;
        static Node tail;
        static int size;

        public static boolean isEmpty(){
            return head==null;
        }
        // push
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // peek
        public static int peek(){
            return head.data;
        }

        // pop
        public static int pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(100);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
