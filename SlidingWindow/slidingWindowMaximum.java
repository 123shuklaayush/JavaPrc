package SlidingWindow;

import java.util.*;

public class slidingWindowMaximum {
    public static ArrayList<Integer> slidingMaximum(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0, j=0;
        int maxSum = -2147483648;
        while(j<arr.size()){
            maxSum = Math.max(maxSum, arr.get(j));

//            {-10, 6, 2, 5, -8, 9, 8, 7, -1}

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 ==k){
                a.add(maxSum);
                if(maxSum == arr.get(i)){
                    maxSum = -2147483648;
                }
                i++; j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(-10);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(-8);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(-1);
        System.out.println(slidingMaximum(arr, 3));
//        System.out.println(arr.get(4));
    }
}
