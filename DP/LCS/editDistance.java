package DP.LCS;

import java.util.Arrays;

public class editDistance {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] ints: dp) Arrays.fill(ints, -1);
        return helper(word1, word2, word1.length()-1, word2.length()-1, dp);
    }
    public static int helper(String s1, String s2, int i , int j, int[][] dp){
        if( i < 0) return j +1;
        if( j < 0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] =  helper(s1, s2, i-1, j-1, dp);
        return dp[i][j] = 1+ Math.min(helper(s1, s2, i-1, j, dp), Math.min(helper(s1, s2, i-1,j-1,dp), helper(s1, s2, i, j-1, dp)));
    }
}
