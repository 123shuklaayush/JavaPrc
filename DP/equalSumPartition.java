package DP;
import java.util.*;

public class equalSumPartition {
//    static int equalPartition(int n, int arr[])
//    {
//        // code here
//        int sum = 0;
//        for(int a : arr) sum+= a;
//        Boolean[][] dp = new Boolean[n+1][sum+1];
//        if(sum %2 != 0) return 0;
//        else{
//            if(helper(n, arr, sum/2, dp)){
//                return 1;
//            }
//            else return 0;
//        }
//
//    }
//    public static Boolean helper(int n, int[] arr, int sum, Boolean[][] dp){
//        if(sum>0 && n ==0){
//            return false;
//        }
//        if(sum== 0) return true;
//        if(dp[n][sum] != null){
//            return dp[n][sum];
//        }
//        if(arr[n-1] > sum){
//            return helper(n-1, arr, sum, dp);
//        }
//        else{
//            return helper(n-1, arr, sum-arr[n-1], dp) || helper(n-1, arr, sum, dp);
//        }
//    }
    // Using Tabular
    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i : nums) sum+=i;

        Boolean[][] dp = new Boolean[n+1][sum+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], false);
        }
        dp[0][0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<=sum; j++){
                if(nums[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 11, 5};
        System.out.println(canPartition(arr));
    }
}
