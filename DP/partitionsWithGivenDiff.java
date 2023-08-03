package DP;

public class partitionsWithGivenDiff {
    public static int countPartitions(int n, int d, int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        int t = (d + sum) / 2;
        if ((d + sum) % 2 != 0) return 0;
        int[][] dp = new int[n + 1][t + 1];
        dp[0][0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < t + 1; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - arr[i - 1]]) % 1000000007;
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][t];
    }
    public static void main(String[] args) {
        int arr[] =  { 5, 2, 6, 4};
        System.out.println(countPartitions(arr.length, 3, arr));
    }
}
