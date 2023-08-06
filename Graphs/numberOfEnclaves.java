package Graphs;

import java.util.*;

public class numberOfEnclaves {
   static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    static int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid.length;
        Queue<Pair> q = new ArrayDeque<>();
        boolean[][] vis = new boolean[n][m];

        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if((i == 0 || i == n-1 || j == 0 || j == m-1) ){
                    if(grid[i][j] ==1 ) {
                        q.add(new Pair(i, j));
                        vis[i][j] = true;
                    }
                }
            }
        }
        int[] delrow = {1,-1,0,0};
        int[] delcol = {0,0,1,-1};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int row = p.first;
            int col = p.second;
            grid[row][col] = 0;

            for(int i = 0; i< 4; i++){
                int nrow = delrow[i] + row;
                int ncol = delcol[i] + col;
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && grid[nrow][ncol] == 1){
                    grid[nrow][ncol] = 0;
                    vis[nrow][ncol] = true;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
        int count = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 1},
                        {0, 1, 1, 0},
                        {0, 1, 1, 0},
                        {0, 0, 0, 1},
                        {0, 1, 1, 0}
        };
        System.out.println(numberOfEnclaves(grid));
    }
}
