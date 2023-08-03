package DP;
import java.util.*;

public class permutation {
    public static List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i< nums.length; i++) arr.add(nums[i]);
        int idx =0;
        helper(arr, list, new ArrayList<>());
        return list;
    }
    public static void helper(ArrayList<Integer> arr, List<List<Integer>> list, ArrayList<Integer> op) {
        if (arr.size() == 0) {
            list.add(new ArrayList<>(op));
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            op.add(arr.get(i));
            arr.remove(i);
            helper(arr, list, op);
            op.remove(op.size()-1);
            arr.add(i, num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 5};
        System.out.println(permute(nums));
    }
}
