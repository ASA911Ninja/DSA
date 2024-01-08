package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        // graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 7, 1));

        graph[7].add(new Edge(7, 6, 1));

    }
    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge> graph[],boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        // boolean visit[] = new boolean[graph.length];
        q.add(0); // source

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visit[curr]){
                visit[curr] = true;
                System.out.print(curr+" ");
                
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }
    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<grpah.length;i++){
            dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[],int curr,boolean visit[]){
        System.out.print(curr+" ");
        visit[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfsUtil(graph,e.dest,visit);                
            }
        }

    }
    public static boolean hasPath(ArrayList<Edge> graph[],int beg,int end,boolean visit[]){
        if(beg==end){
            return true;
        }
        visit[beg] = true;

        for(int i=0;i<graph[beg].size();i++){
            Edge e = graph[beg].get(i);
            if(!visit[e.dest] && hasPath(graph, e.dest, end, visit)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 8;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
        System.out.println();
        
        dfs(graph,0,new boolean[V]);
        System.out.println();
        System.out.println(hasPath(graph, 5, 6, new boolean[graph.length]));
    }
}
