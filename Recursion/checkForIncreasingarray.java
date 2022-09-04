package Recursion;

public class checkForIncreasingarray {
    public static boolean checkSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9};
        System.out.println(checkSorted(arr, 0));
    }
}
