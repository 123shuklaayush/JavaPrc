package Stacks;
import java.lang.reflect.Array;
import java.util.*;
public class stockSpanProblem {
    // Problem Based on Nearest Smallest to Left
    public static int[] calculateSpan(int price[], int n) {
        int arr[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty())
                arr[i]=1;
            else if(s.size()>0 && price[s.peek()]>price[i])
                arr[i]=i-s.peek();

            else if(s.size()>0 && price[s.peek()]<=price[i]){

                while(!s.isEmpty() && price[s.peek()]<=price[i])
                    s.pop();
                if(s.size()==0){
                    arr[i]=i+1;
                }
                else
                    arr[i]=i-s.peek();
            }
            s.push(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(calculateSpan(arr, arr.length)));
    }
}
