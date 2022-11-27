package Stacks;
import java.util.*;
public class maxAreaRectangleInRectangleMatrix
{
    static class pair{
        int val;
        int indices;
        public pair(int val, int indices){
            this.val = val;
            this.indices = indices;

        }
    }
    public static int getMaxArea(ArrayList<Integer> nums, int l) {
        Stack<pair> s = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i< nums.size(); i++){
            if(s.size()==0)
                arr.add(-1);
            else if(s.size()>0 && s.peek().val<nums.get(i))
                arr.add( s.peek().indices);
            else if(s.size()>0 && s.peek().val >=nums.get(i)){
                while(!s.isEmpty() && s.peek().val>=nums.get(i))
                    s.pop();
                if(s.size() == 0)
                    arr.add(-1);
                else
                    arr.add( s.peek().indices);
            }
            s.push(new pair((int) nums.get(i), i));
        }
        Stack<pair> n = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = nums.size()-1; i>=0; i--){
            if(n.size()==0)
                ar.add( nums.size());
            else if(n.size()>0 && n.peek().val<nums.get(i))
                ar.add( n.peek().indices);
            else if(n.size()>0 && n.peek().val >=nums.get(i)){
                while(!n.isEmpty() && n.peek().val>=nums.get(i))
                    n.pop();
                if(n.size() == 0)
                    ar.add(nums.size());
                else
                    ar.add( n.peek().indices);
            }
            n.push(new pair((int) nums.get(i), i));
        }
        Collections.reverse(ar);
        ArrayList<Integer> afin = new ArrayList<>();
        int max =0;
        for(int i= 0; i< ar.size(); i++){
            afin.add((int) ((ar.get(i) - arr.get(i)) -1));
        }

        for(int i = 0;i< afin.size() ; i++){
            max = Math.max(max, nums.get(i) * afin.get(i));
        }
        return max;
    }
    public static int maxRect(int[][] nums, int n, int m){
        ArrayList<Integer> arr =new ArrayList<>();
        for(int j = 0; j<m; j++){
            arr.add(nums[0][j]);
        }
        int max = getMaxArea(arr, arr.size());
        for(int i = 1; i< n; i++){
            for(int j = 0; j< m; j++){
                if(nums[i][j] ==0)
                    arr.set(j, 0);
                else
                    arr.set(j, arr.get(j) + nums[i][j]);
                max = Math.max(max, getMaxArea(arr, arr.size()));
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
        };
        System.out.println(maxRect(arr, 4, 4));
    }

}
