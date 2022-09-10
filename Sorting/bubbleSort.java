package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args){
        int[] arr = {4, 2, 6, 4, 1, 6, 3, 6, 9, 2, 3};
        for(int i = 0; i< arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr[i], arr[j]);
                }
            }
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
