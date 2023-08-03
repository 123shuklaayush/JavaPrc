package DP;

public class isSubsetSumEqualsTarget {
    static Boolean isSubsetSum(int n, int arr[], int sum){
        Boolean[][] dp = new Boolean[n+1][sum+1];
        return helper(n, arr, sum, dp);
    }
    public static Boolean helper(int n, int[] arr, int sum, Boolean[][] dp){
        if(sum> 0 && n==0){
            return false;
        }
        if(sum ==0) return true;
        if (dp[n][sum] != null) {
            return dp[n][sum];
        }
        if(arr[n-1] <= sum){
            return isSubsetSum(n- 1 , arr, sum - arr[n-1]) || isSubsetSum(n-1, arr, sum);
        }
        else{
            return isSubsetSum(n-1, arr, sum);
        }
    }

    public static void main (String[] args) throws java.lang.Exception {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(arr.length, arr, sum));
    }
}
