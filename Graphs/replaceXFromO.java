package Graphs;

public class replaceXFromO {
    static void dfs(char[][] a, int n, int m, int[] delrow, int[] delcol, boolean[][] vis){
        vis[n][m] = true;
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i< 4; i++){
            int nrow= delrow[i] + n;
            int ncol = delcol[i] + m;
            if( nrow >= 0 && ncol >= 0 && nrow < row && ncol < col && !vis[nrow][ncol] && a[nrow][ncol] =='O'){
                dfs(a, nrow, ncol, delrow, delcol, vis);
            }
        }
    }

    static char[][] fill(int n, int m, char a[][])
    {
        boolean[][] vis = new boolean[n][m];
        int[] delrow = {1,-1,0,0};
        int[] delcol = {0,0,1,-1};

        //Starting and ending rows
        for(int i = 0; i< m; i++){
            if ( a[0][i] == 'O' && !vis[0][i] ){
                dfs(a, 0, i, delrow, delcol, vis);
            }

            if( a[n-1][i] == 'O' && !vis[n-1][i] ){
                dfs(a, n-1, i, delrow, delcol, vis);
            }
        }
        //Starting and ending columns
        for(int i = 0; i< n; i++){
            if( a[i][0] == 'O' && !vis[i][0] ){
                dfs(a, i, 0, delrow, delcol, vis);
            }
            if( a[i][m-1] == 'O' && !vis[i][m-1] ){
                dfs(a, i, m-1, delrow, delcol, vis);
            }
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j<m; j++){
                if(!vis[i][j] && a[i][j] == 'O'){
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
}
