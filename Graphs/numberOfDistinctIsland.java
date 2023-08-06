package Graphs;

import java.util.*;

public class numberOfDistinctIsland {
    static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    static String toString(int r, int c){
        return Integer.toString(r) + " " + Integer.toString(c);
    }
    static void dfs(int[][] grid, ArrayList<String> arr, boolean[][] vis, int row, int col, int row0, int col0){
        vis[row][col] = true;
        arr.add(toString(row- row0 , col-col0));
        int n = grid.length;
        int m = grid[0].length;
        int[] delrow = {1,-1,0,0};
        int[] delcol = {0, 0,1,-1};

        for(int i= 0; i< 4; i++){
            int nrow = delrow[i] + row;
            int ncol = delcol[i] + col;
            if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && !vis[nrow][ncol] && grid[nrow][ncol] == 1){
                dfs(grid, arr, vis, nrow, ncol, row0, col0);
            }
        }
    }

    static int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        HashSet<ArrayList<String>> set = new HashSet<>();

        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    ArrayList<String> arr = new ArrayList<>();
                    dfs(grid, arr, vis, i, j, i, j);
                    set.add(arr);
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1}};
        System.out.println(countDistinctIslands(grid));
    }
}
