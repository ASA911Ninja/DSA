package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueueRev {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 2 ; i <10;i+=3){
            q.add(i);
        }
        System.out.println(q);
        System.out.println(rev(q));
    }
    public static Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
}
