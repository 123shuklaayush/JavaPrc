package Recursion;

import java.util.ArrayList;

public class josephusProblem {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i<=n ; i++)
            arr.add(i);
        int res = 0;
        k = k-1;
        int ans = helper(arr, k, 0, res);
        return ans;
    }

    static int helper(ArrayList<Integer> arr, int k, int idx, int ans){
        if(arr.size() == 1){
            ans = arr.get(0);
            return ans;
        }
        idx = (idx+k)%arr.size();
        arr.remove(idx);
        return helper(arr, k, idx, ans);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }
}
