package DP;

import java.util.Arrays;

public class knapSackUsingMemo {
    static int[][] dp = new int[1001][1001];
    public knapSackUsingMemo(){
        for(int row[]: dp)
            Arrays.fill(row, -1);
    }


    static int knapSack(int w, int wt[], int val[], int n)
    {
        if(w == 0 || n == 0) return 0;
        if(dp[w][n] != -1) return dp[w][n];
        if(w>= wt[n-1])
            return dp[w][n] = Math.max((val[n-1] + knapSack(w-wt[n-1], wt, val, n-1)), knapSack(w, wt, val, n-1));
        else
            return dp[w][n] = knapSack(w, wt, val, n-1);
    }

    public static void main(String[] args) {
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int w = 4;
        int n = val.length;
        new knapSackUsingMemo();
        System.out.println(knapSack(w, wt, val, n));
    }
}
