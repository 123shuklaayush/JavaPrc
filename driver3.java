import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class driver3 {
    public static void main(String[] args) {
//        int s = 19;
//        System.out.println(Integer.toBinaryString(s));


        // Floor/Ceil of an array in a sorted array
        int[] arr = {5, 7, 10, 15, 21};
        int l = 0;
        int x = 10;
        int h= arr.length-1;
        int res = -1;
        while(l<x){
            int m = (l+h)/2;
            if(arr[m]<=x){
                l = m+1;
                res = arr[m];
            }
            else{
                x = m-1;
            }
        }
        System.out.println(res);
    }
}