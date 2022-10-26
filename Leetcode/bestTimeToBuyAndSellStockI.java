package Leetcode;
//Procedure: first take a array and from the rightmost side of the array and the rightmost side of the prices array
// get the max from the right
//Suppose prices array is [3, 1, 4, 8, 7, 2, 5], then arr max should be like [8, 8, 8, 8, 7, 5, 5]
// Now you got the maximum element now subtract each of them from prices array and store a max.

public class bestTimeToBuyAndSellStockI {
    public int maxProfit(int[] prices) {
        int[] arr = new int[prices.length];
        int max = 0;
        int m = prices.length-1;
        for(int i = prices.length-1; i>=0; i--){
            max = Math.max(max, prices[i]);
            arr[m] = max;
            m--;
        }
        int fin=0;
        int finmax = 0;
        for(int i = 0; i<prices.length; i++){
            fin = arr[i]-prices[i];
            finmax = Math.max(finmax, fin);
        }
        return finmax;
    }
}
