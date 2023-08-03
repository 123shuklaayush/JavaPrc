package DP.LCS;

import java.util.Arrays;

public class longestCommonSubstr {
    public static int longestCommonSubstring(String str1, String str2, int n, int m){
        int[][] dp = new int[n+1][m+1];
        dp[0][0]= 0;
        int max= 0;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    max = Math.max(dp[i][j], max);
                }
                else dp[i][j] = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String st1 = "ABCDGH";
        String S2 = "ACDGHR";
        int n = st1.length();
        int m = S2.length();
        System.out.println(longestCommonSubstring(st1, S2, n, m));
    }
}
