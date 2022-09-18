package GFG;

import java.util.ArrayList;

public class findDuplicatesinArray {
    public static ArrayList<Integer> duplicates(int arr[], int n){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0; i<n; i++){
            for(int j =1; j<n; j++){
                if(arr[j] == arr[i]){
                    a.add(arr[i]);
                }
            }
        }
        if (a.size() > 0) {
            return a;
        }
        else
            a.add(-1);
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 4};
        int n = arr.length;
        System.out.println(duplicates(arr, n));
    }
}
