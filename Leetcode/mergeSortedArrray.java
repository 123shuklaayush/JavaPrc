package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class mergeSortedArrray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< nums1.length; i++){
            arr.add(nums1[i]);
        }
        for(int i = m-1 ; i< arr.size(); i++){
            arr.remove(arr.get(i));
        }
        for(int i = 0;i<nums2.length; i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        for(int i =0; i<arr.size(); i++){
            nums1[i] = arr.get(i);
        }
        System.out.println(arr.size());
        System.out.println(nums1.length);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] ar2= {2,5,6};

    }
}
