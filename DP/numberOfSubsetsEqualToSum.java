package DP;

import java.util.Arrays;

public class numberOfSubsetsEqualToSum {
//    public static int findWays(int num[], int tar) {
//        int n = num.length;
//        int[][] dp = new int[n+1][tar+1];
//        for (int[] ints : dp) {
//            Arrays.fill(ints, -1);
//        }
//
//        return helper(num, n, tar, dp);
//    }
//    static int helper(int[] arr, int n, int tar, int[][] dp){
//        if(tar ==0) return 1;
//        if(n==0) return 0;
//        if(dp[n][tar] != -1) return dp[n][tar];
//        if(arr[n-1] > tar){
//            return helper(arr, n-1, tar, dp);
//        }
//        else
//            return (helper(arr, n-1, tar-arr[n-1], dp) + helper(arr, n-1, tar, dp));
//    }
public static int findWays(int[] num, int tar) {
    int n = num.length;
    int[][] dp = new int[n + 1][tar + 1];
    dp[0][0] = 1;
    for(int i = 1; i<=n; i++){
        for(int j = 0; j<=tar; j++){
            if(num[i-1] >j)
                dp[i][j] = dp[i-1][j];
            else
                dp[i][j] = dp[i-1][j] + dp[i-1][j-num[i-1]];
        }
    }
    return dp[n][tar];
}

    public static void main(String[] args) {
        int[] arr= {1, 2, 2, 3};
        int tar = 3;
        System.out.println(findWays(arr, tar));
    }
}
