import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class driver3 {
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k){
        int[] newArr = new int[arr.size()];
        for(int i = 0; i< k; i++){
            newArr[i] = arr.get(k);
            k--;
        }
        int[] ar2 = new int[arr.size()];
        for(int i = k+1; i<arr.size(); i++){
            ar2[i] = arr.get(i);
        }
        for(int i = 0; i< arr.size(); i++){
            System.out.print(newArr[i] + " ");
        }
        for(int i = 0; i< arr.size(); i++){
            System.out.print(ar2[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
//        ArrayList<Integer> arr = {3, 1, 8, 9 ,7};
//        int res = reverseInGroups(i.get(i.get()), 5, 3);
    }
}