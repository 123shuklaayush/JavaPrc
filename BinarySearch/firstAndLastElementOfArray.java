package BinarySearch;

import java.util.Arrays;

public class firstAndLastElementOfArray {
    public static int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int res = -1;
        while( j >= i){
            int mid = i + (j-i)/2;
            if(target == nums[mid]){
                res = mid;
                j = mid-1;
            }
            else if( target > nums[mid]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }

        i = 0;
        j = nums.length-1;
        int res2 = -1;
        while( j>= i){
            int mid = i + (j-i)/2;
            if(target ==nums[mid]){
                res2 =mid;
                i = mid +1;
            }
            else if(target > nums[mid]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        int[] ans = {res, res2};
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}
