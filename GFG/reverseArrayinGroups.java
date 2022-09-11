package GFG;

import java.util.*;

public class reverseArrayinGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int m =k;
        int[] a = new int[k];
        for(int i = 0; i< k; i++){
            a[i] = arr.get(m - 1);
            m--;
        }
        int[] b = new int[arr.size()-k];
        int j = arr.size()-1;
        for(int c= 0; c<b.length; c++){
            b[c] = arr.get(j);
            j--;
        }
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
//        reverseArrayinGroups(arr, 5, 3);
    }
}
