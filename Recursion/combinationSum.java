package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static List<List<Integer>> combinationSums(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        int idx = 0;
        int currSum = 0;
        helper(idx, nums, target, arr, new ArrayList<>());
        return arr;
    }
    static void helper(int idx, int[] arr, int target, List<List<Integer>> list, List<Integer> ds){
        if(idx == arr.length){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx] <=target){
            ds.add(arr[idx]);
            helper(idx, arr, target- arr[idx], list, ds);
            ds.remove(ds.size()-1);
        }
        helper(idx+1, arr, target, list, ds);
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        System.out.println((combinationSums(nums, 7)));
    }
}
