package Leetcode;

import java.util.ArrayList;

public class moveZeroes {
    public static void moveZero(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        //Taking values except zero
        for(int i =0; i< nums.length; i++){
            if(nums[i] !=0){
                arr.add(nums[i]);
            } else if (nums[i] == 0) {
                count++;
            }
        }
        //
        // Updating zeroes at last by knowing the number of count of zeroes
        for(int i = 0; i<count; i++){
            arr.add(0);
        }

        // Adding the values again to the array (Done this for getting the answer of leetcode Can be done by this too)
//        for(int i =0; i<nums.length; i++){
//            nums[i]= arr.get(i);
//        }
         System.out.print(arr + " " );
    }

    public static void main(String[] args) {
        int[] arr= {10, 0, 0, 20, 02, 0, 0, 0, 40, 20, 0,0 ,0};
        moveZero(arr);
    }
}
