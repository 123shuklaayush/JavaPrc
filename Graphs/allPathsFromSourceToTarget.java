package Graphs;

import java.util.*;

public class allPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, path, list);
        return list;
    }

    public static void dfs(int[][] graph,int node,List<Integer> path, List<List<Integer>> list){
        if(node == graph.length-1){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i< graph[node].length ; i++){
            int nextNode = graph[node][i];
            path.add(nextNode);
            dfs(graph, nextNode, path, list);
            path.remove(nextNode);
        }
    }
}
