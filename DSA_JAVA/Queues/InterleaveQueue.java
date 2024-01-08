package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// https://practice.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
public class InterleaveQueue {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        Queue<Integer> first = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < N/2; i++){
            first.add(q.remove());
        }
        
        while (!q.isEmpty() && !first.isEmpty()){
            al.add(first.remove());
            al.add(q.remove());
        }
        
        return al;
    }
}
