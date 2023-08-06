package Graphs;
import java.util.*;
public class detectCycleUndirectedBFS {
    class Pair{
        int node;
        int parent;
        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Pair> q = new ArrayDeque<>();
        boolean[] vis = new boolean[V];

        for(int i = 0; i< V; i++){
            if(!vis[i]){
                if(checkCycle(i, adj, vis, V))
                    return true;
            }
        }
        return false;
    }
    public boolean checkCycle(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int v){
        Queue<Pair> q = new ArrayDeque<>();

        vis[i] = true;
        q.add(new Pair(i, -1));
        while(!q.isEmpty()){
            int node = q.peek().node;
            int parent = q.peek().parent;
            q.poll();
            for(int e : adj.get(node)){
                if(!vis[e]){
                    vis[e] = true;
                    q.add( new Pair(e, node));
                }
                else if(parent!= e)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
