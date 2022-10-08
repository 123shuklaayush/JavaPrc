package SlidingWindow;

import java.util.*;

public class firstNegativeNumberInSubArray {
    public static ArrayList<Integer> printFirstNegativeInteger(long arr[], int n, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0, j=0;
        while(j<arr.length){
//            {-8, 2, 3, -6, 10}

            // Calculations
            if(arr[j]<0){
                q.add((int)arr[j]);
            }
            // Incrementing loop until window size condition doesn't satisfy
            if(j-i+1<k){
                j++;
            }

            // If condition satisfy

            else if(j-i+1==k){
                if(q.size()==0){
                    a.add(0);
                }
                //            {-8, 2, 3, -6, 10}

                else{
                    a.add(q.peek());
//                    if(arr[i] <0) {
//                        q.remove();
//                    }
                    if(arr[i] == q.peek()){
                        q.remove();
                    }
                    }
                    i++; j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        long[] arr = {-8, 2, 3, -6, 10};
//        long[] arr = {12, -1, -7, 8, 5, 30, -16, 28};
//        long[] arr = {12, -1, -7, 8, -15};
        System.out.println((printFirstNegativeInteger(arr, arr.length, 3)));
    }
}
