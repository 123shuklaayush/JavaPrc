package DP;

public class frogJumps {
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n+1];
        return helper(n-1, heights, dp);
    }
    public static int helper(int n, int[] heights, int[] dp){
        if( n == 0 ) return 0;
        int left = helper(n-1, heights, dp) + Math.abs(heights[n]-heights[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) {
            right = helper(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }
        return dp[n] = Math.min(left, right);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10};
        System.out.println(frogJump(4, arr));

    }
}
