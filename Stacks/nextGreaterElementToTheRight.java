package Stacks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Stack;

public class nextGreaterElementToTheRight {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Long> s = new Stack<>();
        ArrayList<Long> list = new ArrayList<>();
        for(int i= arr.length-1; i>=0; i--){
            if(s.isEmpty()) list.add((long)-1);
            else if(s.peek() > arr[i]) list.add(s.peek());
            else if(s.peek() <= arr[i]){
                while(!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }
                if(s.isEmpty()) list.add((long)-1);
                else list.add(s.peek());
                }

            s.push(arr[i]);

        }
        Collections.reverse(list);
        long[] ans= new long[list.size()];

        for(int i = 0; i< list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = {1,3,4,2};
        System.out.println(Arrays.toString(nextLargerElement(arr, arr.length)));
        System.out.println(Arrays.toString(nextLargerElement(arr, arr.length)));

    }
}
