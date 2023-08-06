package Graphs;

public class stepsByKnight {
    static int min = Integer.MAX_VALUE;


    public static int minStepToReachTarget(int kpos[], int tarpos[], int N) {
        boolean[][] vis = new boolean[N][N];
        int row = tarpos[0];
        int col = tarpos[1];
        int reqrow = kpos[0];
        int reqcol = kpos[1];
        int currMin = 0;
        dfs(kpos, tarpos, N, vis, row, col, reqrow, reqcol, currMin);
        return min;
    }

    public static void dfs(int[] kpos, int[] tarpos, int n, boolean[][] vis,
                           int row, int col, int reqrow, int reqcol, int currMin) {
        int[] delrow = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] delcol = {2, -2, 2, -2, 1, -1, 1, -1};
        vis[row][col] = true;
        for (int i = 0; i < 8; i++) {
            int r = delrow[i] + row;
            int c = delcol[i] + col;
            if (r >= 0 && c >= 0 && r < n && c < n && !vis[r][c]) {
                currMin++;
                dfs(kpos, tarpos, n, vis, r, c, reqrow, reqcol, currMin);
                if (reqrow == r && reqcol == c)
                    min = Math.min(currMin, min);
                // Backtrack by decrementing currMin when exploring other paths
                currMin--;
            }
        }
        vis[row][col] = false; // Marking the cell as unvisited for future paths
    }

    public static void main(String[] args) {
        int[] kp = {3,4};
        int[] tp = {0,0};
        int n = 5;
        System.out.println(minStepToReachTarget(kp, tp, n));

    }
}
