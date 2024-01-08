package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        Row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }
        public int compareTo(Row r){
            if (this.soldiers==r.soldiers){
                return this.idx-r.idx;
            }
            return this.soldiers-r.soldiers;
        }
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        int j = 0;
        for (int [] i : mat){
            int sum = 0;
            for (int x : i){
                sum+=x;
            }
            pq.add(new Row(sum,j));
            j++;
        }
        for (Row r : pq){

            System.out.println(r.soldiers+" "+r.idx);
        }
        int ans[] = new int[k];
        for (int i = 0;i < k; k++){
            Row r = pq.remove();
            ans[i] = r.idx;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] mat = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        System.out.println(Arrays.toString(kWeakestRows(mat,2)));
    }
}
