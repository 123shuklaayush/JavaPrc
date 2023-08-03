package DP.LCS;

import java.util.Arrays;

public class longestCommonSubsequences {
    public static int longestCommonSubsequence(String text1, String text2) {
        int ans = 0;
        int n = text1.length();
        int m = text2.length();
        int[][] dp= new int[n+1][m+1];
        for(int[] ints: dp) Arrays.fill(ints, -1);
        return helper(text1, text2, text1.length(), text2.length(), dp);
    }
    static int helper(String s1, String s2, int ns1, int ns2, int[][] dp){
        if (ns1 == 0 || ns2 == 0) return 0;
        if(dp[ns1][ns2] != -1) return dp[ns1][ns2];
        if(s1.charAt(ns1-1) == s2.charAt(ns2-1))
            return dp[ns1][ns2] =1+helper(s1, s2, ns1-1, ns2-1, dp);
        else
            return dp[ns1][ns2] = Math.max(helper(s1, s2, ns1-1, ns2, dp) , helper(s1, s2, ns1, ns2-1, dp));
    }
    // USING TABULAR METHOD
    public static int longestCommonSubsequenced(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        dp[0][0]= 0;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
        System.out.println(longestCommonSubsequenced(s1, s2));
    }
}
