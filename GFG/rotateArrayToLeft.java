package GFG;

import java.util.Collections;

public class rotateArrayToLeft {

public static void main(String[] args) {
    StringBuilder s= new StringBuilder();
    int[] arr = {1, 2, 3, 4, 5};
    int k = 2;
    int n = arr.length;
    int[]  A = new int[k];
    for(int i = 0; i<k; i++){
        A[i] = arr[i];
    }
    for(int i = 0; i< arr.length; i++){
        System.out.println(arr[i]);
    }

}
}
