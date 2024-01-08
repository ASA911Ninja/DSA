package Heaps;

import Heaps.SlidingWindowMax.Pair;

// Sliding window maximum -> Tough Leetcode question
// https://leetcode.com/problems/sliding-window-maximum/submissions/
// this question can be solved using dequeue with O(n) complexity
public class SlidingWindowMax { // this solution O(nlogk)
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p){
            return p.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int[arr.length-k+1]; // n-k+1

    }
}
