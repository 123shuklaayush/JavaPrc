package Graphs;

public class findNumberofIsland {
    public int numIslands(char[][] grid) {
        // Code here
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                if(grid[i][j] == '1')
                    if(!vis[i][j]){
                        helper(grid, vis, m, n, i, j);
                        count++;
                    }
            }
        }
        return count;
    }
    void helper(char[][] grid, boolean[][] vis, int m, int n, int i, int j){
        if( i >= m || j >= n || i == 0 || j == 0 || vis[i][j])
            return;

        vis[i][j] = true;

        helper(grid, vis, m, n, i+1, j);
        helper(grid, vis, m, n, i-1, j);
        helper(grid, vis, m, n, i, j+1);
        helper(grid, vis, m, n, i, j-1);
        helper(grid, vis, m, n, i+1, j+1);
        helper(grid, vis, m, n, i+1, j-1);
        helper(grid, vis, m, n, i-1, j+1);
        helper(grid, vis, m, n, i-1, j-1);
    }
}
