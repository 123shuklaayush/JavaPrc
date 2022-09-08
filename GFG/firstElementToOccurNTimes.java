package GFG;
import java.util.*;
public class firstElementToOccurNTimes {
    public int firstElementKTime(int[] a, int n, int k) {
        if(k == 1)return a[0];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i) == k)return i;
            }
            else{
                map.put(i, 1);
            }
        }
        return -1;
    }
}
