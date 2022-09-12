package GFG;

import java.util.*;

public class reverseArrayinGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < arr.size(); i = i + k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.size() - 1);
            int temp;
            while (left < right) {
                temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");

        }
    }
    public static void main(String[] args) {
//        for(int i = 0; i< arr.length; i= i+k) {
//            int left = i;
//            int right = Math.min(i + k - 1, arr.length - 1);
//            int temp;
//            while (left < right) {
//                temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//            for(int j= 0; j< arr.length; j++){
//                System.out.print(arr[j] + " ");
//
//        }
    }
}
