package Hashing;

import java.util.HashMap;
import java.util.Map;

public class findHighestFrequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] arr = {0 ,-5 ,-2 ,-4, 2, -2, -3, -1, -1, -3};
//        int[] arr= {1, 2, 1, -2, -2, -2, 2, 2, 1};
        int[] arr = {1, 2, 1, -2, -2, -2, 2, 2, 1};
        int maxCount  = arr[0];
        int currCount;
        for(int i = 0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1);
                if(map.get(maxCount) < map.get(arr[i])){
                    maxCount = arr[i];
                }
            }
            else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(maxCount);
//        int maxi = arr[0];
//        int value = 0;
//        for(Map.Entry<Integer, Integer> e: map.entrySet()){
////            if(map.get(i) > maxi){
////                maxi = i;
////            }
////            System.out.println(e.getValue());
////            System.out.println(maxi);
//        }
//        System.out.println(maxi);
//        for(Map.Entry<Integer, Integer> e: map.entrySet()){
//            System.out.println(e.getKey() + " " + e.getValue());
//
//        }
    }
}
