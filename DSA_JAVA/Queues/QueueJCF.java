package Queues;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(20);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(7);
        q2.add(11);
        q2.add(100);
        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}
