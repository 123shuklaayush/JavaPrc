package Recursion;

public class maxStrengthOfGroup {
    static long longest = 1;

    public static long maxStrength(int[] nums) {
        return helper(nums, 0, 1);
    }

    public static long helper(int[] nums, int idx, long prod) {
        if (idx == nums.length) {
            return prod; // Return the product at the end of the array
        }
        for (int i = 0; i < nums.length; i++) {
            int pro = nums[idx];
            helper(nums, idx + 1, prod * pro);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {3,-1,-5,2,5,-9};
        System.out.println(maxStrength(nums));
    }
}
