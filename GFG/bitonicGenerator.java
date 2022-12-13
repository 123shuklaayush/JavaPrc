package GFG;

import java.util.*;

public class bitonicGenerator {
    static void bitonicGenerator(long arr[], int n)
    {
        ArrayList<Long> even = new ArrayList<>();
        ArrayList<Long> odd = new ArrayList<>();


        for(int i =0; i< n; i++){
            if(i%2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());


        for(int i = 0; i< even.size(); i++){
            arr[i] = even.get(i);

        }
        for(int i = 0; i< odd.size();i++){
            arr[even.size()+i] = odd.get(i);
        }
    }
    public static void main(String[] args) {
        long[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        bitonicGenerator(arr, arr.length);



    }
}
