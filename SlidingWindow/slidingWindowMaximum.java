package SlidingWindow;

import java.util.*;

public class slidingWindowMaximum {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i : arr) nums.add(i);
        return maxOfSubarrays(nums, n, k);
    }
    public static ArrayList<Integer> maxOfSubarrays(ArrayList<Integer> arr, int n, int k) {
        Deque<Integer> q = new LinkedList<>();
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (j < n) {
            while (!q.isEmpty() && q.peekLast() < arr.get(j))
                q.removeLast();
            q.addLast(arr.get(j));

            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                res.add(q.peekFirst());
                if (q.peekFirst().equals(arr.get(i)))
                    q.removeFirst();
                i++;
                j++;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(-10, 6, 2, 5, -8, 9, 8, 7 ,-1));
        System.out.println(maxOfSubarrays(arr, arr.size(), 3));
    }
}
