package DP;

import java.util.Arrays;

public class maximalSquare {
    int maxi = 0;
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n+1][m+1];

        for(int[] ints: dp) Arrays.fill(ints, -1);

        solve(matrix, 0, 0, n, m, dp);
        return maxi * maxi;
    }

    public int solve(char[][] matrix, int i, int j, int n, int m, int[][] dp) {
        if (i >= n || j >= m) {
            return 0;
        }
        if(dp[n][m] != -1) return dp[n][m];
        int right = solve(matrix, i, j + 1, n, m, dp);
        int diag = solve(matrix, i + 1, j + 1, n, m, dp);
        int bottom = solve(matrix, i + 1, j, n, m, dp);

        if (matrix[i][j] == '1') {
            int ans = 1 + Math.min(right, Math.min(diag, bottom));
            maxi = Math.max(maxi, ans);
            return ans;
        } else {
            return 0;
        }
    }
}
