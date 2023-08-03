package DP.LCS;

import jdk.dynalink.linker.LinkerServices;

public class printLongestCommonSubstr {
    public static String printLongestCommonSubstring(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        dp[0][0] = 0;
        int max = 0;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
                else dp[i][j] = 0;
            }
        }
        int i = m, j = n;
        StringBuilder sb = new StringBuilder();
        StringBuilder currSb = new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                currSb.insert(0, s1.charAt(i-1));
                if(currSb.length()> sb.length()){
                    sb.delete(0, sb.length());
                    sb.insert(0, currSb);
                }
                i--; j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]) {
                currSb.delete(0, currSb.length());
                i--;
            }
            else{
                currSb.delete(0, currSb.length());
                j--;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "babdbcab";
        String s2 = "bacbdbab";
        System.out.println(printLongestCommonSubstring(s1, s2));
    }
}
