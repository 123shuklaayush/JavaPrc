package DP;

public class dungeonProblem {
    public static int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] dp = new int[row+1][col+1];
        dp[row-1][col-1] = Math.max(1, 1-dungeon[row-1][col-1]);

        for (int i = row - 2; i >= 0; i--) {
            int element = dp[i+1][col-1];
            int dungeonElement = dungeon[i][col-1];

            dp[i][col - 1] = Math.max(dp[i + 1][col - 1] - dungeon[i][col - 1], 1);
        }

        for (int j = col - 2; j >= 0; j--) {
            int element = dp[row-1][j+1];
            int dungeonElement = dungeon[row-1][j];

            dp[row - 1][j] = Math.max(dp[row - 1][j + 1] - dungeon[row - 1][j], 1);
        }
        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                int minHealthOnExit = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minHealthOnExit - dungeon[i][j], 1);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        };
        System.out.println(calculateMinimumHP(arr));
    }
}
