package GFG;

import java.util.*;

public class firstNegativeNumberInSubArray {
    public static long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
        Queue<Long> q = new ArrayDeque<>();
        long[] p = new long[n];
        int i = 0, j=0;
        int m = 0;
        while(j<arr.length){
            if(arr[j]<0){
                q.add( arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i==k){
                if(q.size()==0){
                    q.add(0L);
                }
                else{
                    if(arr[i] == q.peek());
                    p[m] = p[Math.toIntExact(q.peek())];
                    q.remove();
                    m++;
                }

            }
        }
        return p;
    }

    public static void main(String[] args) {
        long[] arr = {-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(arr, arr.length, 2)));
    }
}
