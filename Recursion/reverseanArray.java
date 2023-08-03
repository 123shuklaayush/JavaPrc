package Recursion;

import java.util.Arrays;

public class reverseanArray {
    static int[] reversearr(int[] nums){
        int start = 0;
        int end = nums.length-1;
        helper(nums, start, end);
        return nums;
    }
    static void helper(int[] arr, int start, int end){
        if(end <= start){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        helper(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reversearr(arr)));
    }
}
