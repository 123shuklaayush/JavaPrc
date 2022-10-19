package Leetcode;

public class containerWithMostWater {
    public static int height(int[] arr){
        int max = 0;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int lh = arr[i];
            int rh = arr[j];
            int min_h= Math.min(lh, rh);
            max = Math.max(max, min_h *(j-i));
            if(lh<rh){
                i++;
            }
            else
                j--;

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(height(arr));
    }
}
