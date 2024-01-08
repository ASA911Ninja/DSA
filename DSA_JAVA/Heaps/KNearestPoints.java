package Heaps;

import java.util.PriorityQueue;

import Heaps.KNearestPoints.Point;

public class KNearestPoints {
    public static int dist(int x,int y){
        return x*x+y*y;
    }
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        Point(int x,int y,int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(Point z){
            return this.dist - z.dist; // ascending order
        }
    }

    public static void main(String[] args) {
        int [][]points = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i<points.length;i++){
            pq.add(new Point(points[i][0], points[i][1], dist(points[i][0],points[i][1])));

        }
        // nearest K

        for (int i = 0;i<k;i++){
            System.out.println(pq.remove());
        }

    }
}
