package Recursion;
import java.util.*;
public class printNumToN {
    public static void printNos(int N)
    {
        if(N==0)
            return;
        printNos(N-1);
        System.out.print(N + " ");
    }

    public static ArrayList<Integer> oneToN(int N){

        ArrayList<Integer> arr = new ArrayList<>();
        helper(arr, N, 1);
        return arr;
    }
    public static void helper(ArrayList<Integer> arr, int n, int cn){
        if(cn == n) {
            arr.add(cn);
            return;
        }
        arr.add(cn);
        helper(arr, n, cn+1);
    }
    //To reverse the sequence
//    public static void helper(ArrayList<Integer> arr, int n, int cn){
//        if(n==1) {
//            arr.add(n);
//            return;
//        }
//        arr.add(n);
//        helper(arr, n-1, cn);
//    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =oneToN(5);
        System.out.println(arr);
    }
}
