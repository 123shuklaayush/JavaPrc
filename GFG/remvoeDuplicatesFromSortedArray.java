package GFG;

import java.util.ArrayList;

public class remvoeDuplicatesFromSortedArray {
    public static int remove_duplicate(int A[],int N){
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i= 0; i< A.length ; i++){
            if(A[i] == A[Math.min(i+1, A.length)]){
                arr.remove(A[i]);
            }
        }
        return arr.size();
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2};
        System.out.println(remove_duplicate(arr, 4));
    }
}
