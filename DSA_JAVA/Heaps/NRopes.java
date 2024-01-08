package Heaps;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

public class NRopes {

    public static int minCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr){
            pq.add(i);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost+=min1+min2;
            pq.add(min1+min2);
        }
        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };
        System.out.println(minCost(ropes));
    }
}
