package DP;

import java.util.Arrays;

public class knapSackUsingMemo {
    static int[][] dp = new int[1001][1001];
    public knapSackUsingMemo(){
        for(int row[]: dp)
            Arrays.fill(row, -1);
    }





    public static void main(String[] args) {
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int w = 4;
        int n = val.length;
        new knapSackUsingMemo();

    }
}
