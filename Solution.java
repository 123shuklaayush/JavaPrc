import java.math.BigInteger;
import java.util.*;

class Solution{
    static int[][] dp = new int[1001][1001];
    public Solution(){
        for(int row[]: dp)
            Arrays.fill(row, -1);
    }
    static int knapSack(int n, int w, int val[], int wt[], int[][] dp)
    {
        if(w == 0 || n == 0) return 0;
        if(dp[w][n] != -1) return dp[w][n];
        if(w>= wt[n-1])
            return dp[w][n] = Math.max((val[n-1] + knapSack(n, w-wt[n-1], val, wt, dp)), knapSack(n-1, w, val, wt, dp));
        else
            return dp[w][n] = knapSack(n-1, w, val, wt,dp);
}
    public static void main(String[] args) {

        int num = 192;
    }
}
