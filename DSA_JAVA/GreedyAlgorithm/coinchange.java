package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class coinchange {
    public static void main(String[] args) {
        int coins [] = {186,419,83,408};
        int amount = 6249;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int [] coins, int amount) {
        Integer coinArr[] = new Integer[coins.length];
        for (int i=0;i<coins.length;i++){
            coinArr[i] = coins[i];
        }
        Arrays.sort(coinArr, Comparator.reverseOrder());
        int i = coins.length-1;
        int coinnum = 0;
        System.out.println(Arrays.toString(coins));
        while(i>=0){
            coinnum += amount/coins[i];
            amount = amount%coins[i];
            System.out.println(coins[i]+" " +coinnum+" "+amount);
            i--;
        }
        if (amount != 0){
            return -1;
        }
        return coinnum;
    }
}
