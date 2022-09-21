package GFG;

import java.util.ArrayList;

public class maximumSumSubarray {
    // This question is based on window slider
    public static int maximumSubArray(int[] arr, int n, int k){
        int sum=0;
        int i = 0;
        int j= 0;
        int max = 0;

        while(j<arr.length){
            sum += arr[j];
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 1};
        int k = 3;
        int res = maximumSubArray(arr, arr.length, k);
        System.out.println(res);
    }
}
