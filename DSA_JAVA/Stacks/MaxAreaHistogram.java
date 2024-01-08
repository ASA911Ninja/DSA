package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(heights));
    }
    public static void maxArea1(int heights[]){
        ArrayList<Integer> allareas = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            int maxAr = 0;
            int leftCount = 0;
            int rightCount = 0;
            int j = i + 1; // right
            while (j < heights.length && heights[j] >= heights[i]) {
                rightCount++;
                j++;
            }
            j = i; // left
            while (j >= 0 && heights[j] >= heights[i]) {
                leftCount++;
                j--;
            }
            maxAr = heights[i] * (leftCount + rightCount);
            allareas.add(maxAr);
        }
        System.out.println(Collections.max(allareas));
    }
    public static int maxArea(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Left
        s.clear();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current Area | width : j-i-1 = nsr[i]-nsl[i]-1 | length : arr[i]
        for (int i=0;i<n;i++){
            int area = arr[i]*(nsr[i]-nsl[i]-1);
            if (area>max){
                max = area;
            }

        }
        return max;


    }

}
