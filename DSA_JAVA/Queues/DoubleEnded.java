package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class DoubleEnded {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(1);
        deque.addFirst(10);
        deque.addFirst(13);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
