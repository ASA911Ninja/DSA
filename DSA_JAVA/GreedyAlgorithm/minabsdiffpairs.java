package GreedyAlgorithm;

import java.util.Arrays;

import OOPS.statickeyword;

public class minabsdiffpairs {
    public static void main(String[] args) {
        int a [] ={4,1,8,7};
        int b [] ={2,3,6,5};
        // 0 1 2 3 
        // 1 2 3 4 = 4
        Arrays.sort(a);
        Arrays.sort(b);
        // System.out.println(Arrays.toString(a));
        int count = 0;
        for (int i=0;i<a.length;i++){
            count+=mod(a[i],b[i]);
        }
        System.out.println(count);
    }
    public static int mod(int a,int b){
        if(a-b<0){
            return (a-b)*(-1);
        }
        else{
            return a-b;
        }
    }

}
