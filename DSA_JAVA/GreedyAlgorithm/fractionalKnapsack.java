package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

// Given the weights and profits of N items, in the form of {profit, weight} put these items in a knapsack of capacity W to get the maximum total profit in the knapsack.
// In Fractional Knapsack, we can break items for maximizing the total value of the knapsack.
// Input: arr[] = {{60, 10}, {100, 20}, {120, 30}}, W = 50
// Output: 240 
// Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. 
// Hence total price will be 60+100+(2/3)(120) = 240
// refer to question at https://www.geeksforgeeks.org/fractional-knapsack-problem/
public class fractionalKnapsack {
    public static void main(String[] args) {
        int weight [] = {10,20,30};
        int value [] = {60,100,120};
        int W = 50;
        double ratio [][] = new double[weight.length][2];
        // 0th col -> idx , 1st col -> ratio of value and weight

        for (int i=0;i<weight.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)value[i]/weight[i];

        }
        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int val = 0;
        for (int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if (capacity>=weight[idx]){
                val += value[idx];
                capacity-=weight[idx];
            } else{
                val += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value = "+val);


    }

}
