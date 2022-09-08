package GFG;//import java.sql.Array;
import java.util.*;

public class checkEqualArrays {
     public static boolean check(long[] a, long[] b, int N)
        {
//           ArrayList<Integer> arr = new ArrayList<>();
//           ArrayList<Integer> brr = new ArrayList<>();
           Arrays.sort(a);
           Arrays.sort(b);
           for(int i = 0 ; i< N; i++){
               if(a[i] != b[i]){
                   return false;
               }
           }
           return true;
    }

    public static void main(String[] args) {
        long[] arr = {3, 5, 6, 7, 8};
        long[] ar = {3, 6, 5, 7, 8};
        boolean res = check(arr, ar, 5);
        System.out.println(res);
    }
}
