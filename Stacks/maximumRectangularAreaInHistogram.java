package Stacks;

import java.lang.reflect.Array;
import java.util.*;

public class maximumRectangularAreaInHistogram {
    public static long getMaxArea(long[] nums, long l) {
        Stack<pair> s = new Stack<>();
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i< nums.length; i++){
            if(s.size()==0)
                arr.add(-1L);
            else if(s.size()>0 && s.peek().val<nums[i])
                arr.add((long) s.peek().indices);
            else if(s.size()>0 && s.peek().val >=nums[i]){
                while(!s.isEmpty() && s.peek().val>=nums[i])
                    s.pop();
                if(s.size() == 0)
                    arr.add(-1L);
                else
                    arr.add((long) s.peek().indices);
            }
            s.push(new pair((int) nums[i], i));
        }
        Stack<pair> n = new Stack<>();
        ArrayList<Long> ar = new ArrayList<>();
        for (int i = nums.length-1; i>=0; i--){
            if(n.size()==0)
                ar.add((long) nums.length);
            else if(n.size()>0 && n.peek().val<nums[i])
                ar.add((long) n.peek().indices);
            else if(n.size()>0 && n.peek().val >=nums[i]){
                while(!n.isEmpty() && n.peek().val>=nums[i])
                    n.pop();
                if(n.size() == 0)
                    ar.add((long)nums.length);
                else
                    ar.add((long) n.peek().indices);
            }
            n.push(new pair((int) nums[i], i));
        }
        Collections.reverse(ar);
        ArrayList<Integer> afin = new ArrayList<>();
        long max =0;
        for(int i= 0; i< ar.size(); i++){
            afin.add((int) ((ar.get(i) - arr.get(i)) -1));
        }

        for(int i = 0;i< afin.size() ; i++){
            max = Math.max(max, nums[i] * afin.get(i));
        }
        return max;
    }
    static class pair{
        int val;
        int indices;
        public pair(int val, int indices){
            this.val = val;
            this.indices = indices;

        }
    }

    public static void main(String[] args) {
        long[] arr= {6, 2, 5, 4, 5, 1, 6};
        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(6);
        ar.add(2);
        ar.add(5);
        ar.add(4);
        ar.add(5);
        ar.add(1);
        ar.add(6);
        System.out.println(getMaxArea(arr, arr.length));
    }

}