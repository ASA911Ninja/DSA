package Stacks;

import java.util.Arrays;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class NextGreater {
    public static void main(String[] args) {
        long arr[] = { 1, 3, 2, 4 };
        int arr2[] = { 1, 3, 2, 4 };
        System.out.println(Arrays.toString(nextLargerElement(arr, 4)));
        System.out.println(Arrays.toString(nextLargerElement2(arr2)));
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long next[] = new long[n];
        next[n - 1] = -1;
        for (int i = 0; i < n - 1; i++) {
            boolean found = false;
            int j = i;
            while (j < n) {
                if (arr[j] > arr[i]) {
                    found = true;
                    next[i] = arr[j];
                    break;
                }
                j++;
            }
            if (!found) {
                next[i] = -1;
            }
        }
        return next;
    }

    public static int[] nextLargerElement2(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int nextGreat[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreat[i] = -1;
            } else {
                nextGreat[i] = s.peek();
            }
            s.push(arr[i]);
        }

        return nextGreat;

    }

}
