package DP.UKS;
import java.util.*;
public class rodCutting {
    public int cutRod(int price[], int n) {
        int[] len = new int[n];
        int m = 1;
        for(int i = 0; i< len.length; i++){
            len[i] = m;
            m++;
        }
        int w = len.length;
        int[][] dp = new int[n+1][w+1];
        for(int[] ints: dp) Arrays.fill(ints, -1);
        return helper(n, w, price, len, dp);
        //code here
    }
    static int helper(int n, int w, int[] val, int[] wt, int[][] dp){
        if( n == 0 || w == 0 ) return 0;
        if(dp[n][w] != -1) return dp[n][w];
        if(w >= wt[n-1])
            return dp[n][w] = Math.max((val[n-1] + helper(n, w-wt[n-1], val, wt, dp)), helper(n-1, w, val, wt, dp));

        else
            return dp[n][w] = helper(n-1, w, val, wt, dp);
    }
}
