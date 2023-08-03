package DP.LCS;

import java.util.Arrays;

public class wordWrap {
    public int solveWordWrap (int[] nums, int k)
    {
        // Code here
        int n = nums.length;
        int[][] dp = new int[n+1][k+1];
        for(int[] ints: dp) Arrays.fill(ints, -1);
        int idx = 0;
        int rem = k;
        int ans = helper(nums, rem, k, idx, dp);
        return ans;
    }
    static int helper(int[] nums, int rem, int k, int idx, int[][] dp){
        if(idx == nums.length) {
            return 0;
        }
        int includeInSameLine = Integer.MAX_VALUE;
        if(nums[idx] < rem) includeInSameLine = helper(nums, rem-nums[idx]-1, k, idx+1, dp);
        else if( nums[idx] ==rem ){
            includeInSameLine = helper(nums, rem, k, idx+1 ,dp);
        }
        int includeInNextLine = ((rem +1 ) *(rem+1)) + helper(nums, rem-nums[idx]-1, k, idx+1, dp);
        return dp[idx][rem] = Math.min(includeInSameLine, includeInNextLine);
    }
}
