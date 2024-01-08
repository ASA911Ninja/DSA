package Stacks;

import java.util.Stack;

public class TrappingRainwater {
    public void trap(int[] height) { // make the return type int while solving
        int sum = 0;
        int n = height.length;
        int ngr[] = new int[n];
        int ngl[] = new int[n];
        Stack<Integer> s =new Stack<>();
        for (int i=n-1;i>=0;i--){
            while (!s.isEmpty() && s.peek()>=height[i]){
                s.pop();
            }
            if (s.isEmpty()){
                ngr[i] = 0; //note revise
            } else {
                ngr[i] = s.peek();
            }
            s.push(height[i]);
        }
        s.clear();
        // for (int )
    }
}
