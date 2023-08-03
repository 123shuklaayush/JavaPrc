package DP.LCS;

public class printShortestCommonSupersequence {
    public static String shortestCommonSupersequence(String string1, String string2) {
        int m = string1.length();
        int n = string2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(string1.charAt(i-1) == string2.charAt(j-1))
                    dp[i][j]= 1+ dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        // Retrieve the longest common subsequence
        StringBuilder longestSubsequence = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (string1.charAt(i - 1) == string2.charAt(j - 1)) {
                longestSubsequence.insert(0, string1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                longestSubsequence.insert(0, string1.charAt(i-1));
                i--;
            } else {
                longestSubsequence.insert(0, string2.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            longestSubsequence.insert(0, string1.charAt(i-1));
            i--;
        }
        while(j>0){
            longestSubsequence.insert(0, string2.charAt(j-1));
            j--;
        }

        return longestSubsequence.toString();
    }

    public static void main(String[] args) {
        String a = "abac";
        String b= "cab";
        System.out.println(shortestCommonSupersequence(a, b));
    }
}
