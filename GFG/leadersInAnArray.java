package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInAnArray {
    public static ArrayList<Integer> leaders(int[] arr, int n){
        // Your code here
        ArrayList<Integer> max = new ArrayList<>();
//        int maxNum = arr[0];
//        int count = 0;
//        for(int i = 0; i <arr.length;i++){
//            for(int j =i+1; j<arr.length-1; j++){
//
//                if(arr[i] > arr[j]){
//                    count+=1;
//
//                }
//                if(count == arr.length-i-1){
//                    maxNum = arr[i];
//                    max.add(maxNum);
//                    count =0;
//                }
//            }
//            int[] arr = {16, 17, 4, 3, 5, 2};
        int maxSum=0;
        for(int i =arr.length-1; i>=0; i--){
            if(maxSum <= arr[i]){
                max.add(arr[i]);
                maxSum = arr[i];
            }
        }
        Collections.sort(max,Collections.reverseOrder());

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,32, 1, 53, 7, 2,12, 7, 1, 5};
        int n = arr.length;
        System.out.println(leaders(arr, n));
    }
}
