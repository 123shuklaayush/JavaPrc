package DP.UKS;

import java.util.ArrayList;
import java.util.Arrays;

public class coinChange {
        public static int coinChange(int[] coins, int amount) {
            int n = coins.length;
            int[][] dp = new int[n+1][amount+1];

            for(int i = 0; i <= amount; i++){
                dp[0][i] = (int) 1e9;
            }

            for(int i = 1; i <= n; i++){
                dp[i][0] = 0;
            }

            if(coins.length == 1 && amount%coins[0] == 0){
                return amount/coins[0];
            }
            else if(coins.length == 1 && amount%coins[0] != 0) {
                return -1;
            }

            for(int i = 1; i <= amount; i++){
                if(i%coins[0] == 0){
                    dp[0][i] = i/coins[0];
                }
                else{
                    dp[0][i] = (int) 1e9;
                }
            }

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= amount; j++){
                    if(coins[i-1] <= j){
                        dp[i][j] = Math.min(1 + dp[i][j-coins[i-1]], dp[i-1][j]);
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }

            if(dp[n][amount] >= (int) 1e9) {
                return -1;
            }

            return dp[n][amount];

    }
    public static void main(String[] args) {
        int[] arr = {7, 5, 1};
        int amount = 18;
        System.out.println(coinChange(arr, amount));
    }
}
