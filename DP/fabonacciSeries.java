package DP;

import java.util.Arrays;

public class fabonacciSeries {
    static int[] dp = new int[25];
    public fabonacciSeries(){
        Arrays.fill(dp, -1);
    }
//    public static int fabs(int n){
//        if(n<=1){
//            return n;
//        }
//        if(dp[n] != -1) {
//            return dp[n];
//        }
//        else
//            return dp[n]= fabs(n-1) + fabs(n-2);
//    }

//    USING DP
//    public static int fabo (int n){
//        int[] dp = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i = 2; i<=n ; i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }

//    With MORE SPACE OPTIMISATION
    public static int dp(int n){
        int prev2 = 0;
        int prev = 1;
        for(int i = 2; i<=n; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        fabonacciSeries fab = new fabonacciSeries();
        System.out.println(dp(6));

    }
}
