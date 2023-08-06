package Graphs;

import java.util.ArrayList;

public class detectCycleUndirectedDFS {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for(int i = 0; i< V; i++){
            if(!vis[i]){
                if(checkForCycle(i, -1, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkForCycle(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> arr) {
        vis[node] = true;

        for (int it : arr.get(node)) {
            if (!vis[it]) {
                if (checkForCycle(it, node, vis, arr))
                    return true;
            } else if (it != parent) {
                return true;
            }
        }
        return false;
    }
}
