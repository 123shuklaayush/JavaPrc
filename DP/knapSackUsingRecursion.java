package DP;

import java.sql.Array;
import java.util.Arrays;

public class knapSackUsingRecursion {

    static int knapSack(int w, int wt[], int val[], int n) {
        if(w == 0 || n == 0) return 0;
        if(w>= wt[n-1])
            return Math.max((val[n-1] + knapSack(w-wt[n-1], wt, val, n-1)), knapSack(w, wt, val, n-1));
        else
            return knapSack(w, wt, val, n-1);
    }
    public static void main(String[] args) {
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int w = 4;
        int n = val.length;
        new knapSackUsingRecursion();
        System.out.println(knapSack(w, wt, val, n));
    }
}
