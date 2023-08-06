package Graphs;

import java.util.*;

public class rottenOranges {
    static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    //Function to find minimum time required to rot all oranges.
    public static int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[] delRow = {1, -1, 0, 0};
        int[] delCols = {0, 0, 1, -1};
        int t = -1;
        int sum = 0;
        int[][] vis = new int[n][m];

        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                sum += grid[i][j];
                vis[i][j] = grid[i][j];

                if(grid[i][j] == 2){
                    q.add(new Pair(i, j));
                }
            }
        }

        if(sum ==0) return 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                Pair pair = q.poll();
                int row = pair.first;
                int cols = pair.second;

                for(int i = 0; i< 4; i++){
                    int nrow = row + delRow[i];
                    int ncols = cols + delCols[i];

                    if(nrow >= 0 && ncols >= 0 && ncols < m && nrow < n && vis[nrow][ncols] == 1){
                        vis[nrow][ncols] = 2;
                        q.add(new Pair(nrow, ncols));
                    }
                }
                size--;
            }
            t++;
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if(vis[i][j] == 1) return -1;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,1,2},
                {0,1,2},
                {2,1,1}};
        System.out.println(orangesRotting(grid));
    }
}
