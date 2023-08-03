package DP;

import java.util.Arrays;

public class matrixChainMultip {
    static int matrixMultiplication(int N, int arr[])
    {
        int i = 1;
        int j = arr.length-1;
        int[][] dp = new int[1001][1001];
        for(int[] ints: dp) Arrays.fill(ints, -1);
        return helper(arr, i, j, dp);
    }

    static int helper(int[] arr, int i, int j, int[][]dp){
        int min = Integer.MAX_VALUE;
        if(i >=j) return 0;
        for(int k = i; k<j; k++){
            if(dp[i][j] != -1) return dp[i][j];
            int solve = helper(arr, i, k, dp) + helper(arr, k+1, j, dp) + arr[i-1]* arr[k] * arr[j];
            if(solve < min)
                min = solve;
        }
        return dp[i][j] = min;
    }
}
