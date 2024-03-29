package Queues;

import java.util.Stack;

// Implementing queue using 2 stacks
public class Queue2Stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int val) {
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }

            s1.push(val);

            while (!s2.isEmpty()) {
                s1.push(s2.peek());
                s2.pop();
            }

        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(10);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
