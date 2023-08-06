package Graphs;

import java.util.ArrayList;

public class numberOfProvinces {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        int count = 0;
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                helper(adj, i, vis);
                count++;
            }
        }
        return count;
    }

    static void helper(ArrayList<ArrayList<Integer>> adj, int v, boolean[] vis) {
        vis[v] = true;
        for (int i : adj.get(v)) {
            if (!vis[i]) {
                vis[i] = true;
            }
        }
    }
}
