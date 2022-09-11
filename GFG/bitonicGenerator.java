package GFG;

import java.util.*;

public class bitonicGenerator {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 5};
        Arrays.sort(arr);
        int[] ar1 = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            if(arr[i] %2 == 0){
                ar1[i] = arr[i];
            }
        }
        for(int i = 0; i< ar1.length; i++){
            if(arr[i] !=0){
                System.out.println(ar1[i]);
            }
        }


    }
}
