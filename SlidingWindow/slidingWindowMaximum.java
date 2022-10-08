package SlidingWindow;

import java.lang.reflect.Array;
import java.util.*;

public class slidingWindowMaximum {
    public static ArrayList<Integer> slidingMaximum(final List<Integer> arr, int k) {
        Queue<Integer> g = new ArrayDeque<>();
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0, j=0;
        int maxSum = -2147483648;
        while(j<arr.size()){
            maxSum = Math.max(maxSum, arr.get(j));

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 ==k){
                a.add(maxSum);
                if(maxSum == arr.get(i)){
                    arr.remove(i);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(-1);
        arr.add(-3);
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(7);
//        System.out.println(slidingMaximum(arr, 3));
        System.out.println("Hello world");
    }
}
