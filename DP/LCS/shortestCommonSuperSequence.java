package DP.LCS;

import com.sun.jdi.PathSearchingVirtualMachine;

public class shortestCommonSuperSequence {
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int[][] dp = new int[n+1][m+1];
        dp[0][0] = 0;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=m; j++){
                if(X.charAt(j-1) == Y.charAt(i-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);

            }
        }
        return (m+n)- dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(shortestCommonSupersequence(s1, s2, s1.length(), s2.length()));
    }
}
