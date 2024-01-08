package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class StacknQueueUsingDeque {
    static class Stack {
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty() {
            return d.isEmpty();
        }

        public static void push(int data) {
            d.addFirst(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = d.getFirst();
            d.removeFirst();
            return top;
        }

        public static int peek() {
            return d.getFirst();
        }
    }

    static class Queue {
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty() {
            return d.isEmpty();
        }

        public static void add(int data) {
            d.addLast(data);
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int first = d.getFirst();
            d.removeFirst();
            return first;
        }

        public static int peek() {
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("The Queue is as follows");
        q.add(3);
        q.add(11);
        q.add(17);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

        Stack s = new Stack();
        System.out.println("The Stack is as follows");
        s.push(1);
        s.push(10);
        s.push(7);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
