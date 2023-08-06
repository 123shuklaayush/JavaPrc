package Graphs;
import java.util.*;
public class bipartiteGraph {
    public boolean checkBipartite (int v, ArrayList<ArrayList<Integer>>adj,
                                   int start, int[] vis){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        vis[start]= 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();

            for(int i: adj.get(node)){
                if(vis[i] == -1){
                    vis[i] = 1- vis[node];
                    q.add(i);
                }
                else if(vis[i] == vis[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] vis = new int[V];
        Arrays.fill(vis, -1);
        for(int i = 0; i< V; i++){
            if(vis[i] == -1){
                if(!checkBipartite(V, adj, i, vis)){
                    return false;
                }
            }
        }
        return true;
    }
}
