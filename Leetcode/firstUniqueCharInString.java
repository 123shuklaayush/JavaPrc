package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqueCharInString{
        public int firstUniqChar(String s) {
            int count = 0;
            String[] c = s.split("");
            HashMap<String, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i< c.length ; i++){
                if(map.containsKey(c[i]))
                    map.put(c[i], map.get(c[i])+ 1);
                else
                    map.put(c[i], 1);
            }
            for(Map.Entry<String, Integer> e: map.entrySet()){
                if(e.getValue() == 1)
                    count++;
            }

            return count;
        }
}
