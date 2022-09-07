package Hashing;

import java.util.HashMap;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Adding values in HashMap
        map.put("India", 120);
//        map.put("China", 150);
        map.put("US", 20);
//        System.out.println(map);
        map.put("china", 410);
//        System.out.println(map);
//
//        //Searching
//        System.out.println(map.containsKey("china"));
        System.out.println(map.get("china"));

//        int[] arr = {42, 41, 4, 5, 6, 7, 9};
//        for(int i: arr){
//            System.out.println(i);
//        }
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key + " " + map.get(key));
        }
    }


}
