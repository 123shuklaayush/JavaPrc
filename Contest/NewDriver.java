package Contest;
import java.math.BigInteger;
import java.util.*;

public class NewDriver{
    public int majorityElement(final int[] A) {
        if(A.length == 1) return A[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< A.length; i++){
            if(map.containsKey(A[i]))
                map.put(A[i], map.get(A[i])+ 1);
            else
                map.put(A[i], 1);
        }
        int max = 0;
        int ans =0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if( max < e.getValue() ){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr = {1};
    }
}
