package Stacks;
import java.lang.reflect.Array;
import java.util.*;

public class nearrestsmallestelementToTheLeft {
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.size(); i++){
            if(s.isEmpty())
                arr.add(-1);
            else if(s.peek()<A.get(i))
                arr.add(A.get(i));
            else if(s.peek()>A.get(i)){
                while(s.isEmpty() && s.peek()>A.get(i)) s.pop();
                if(s.isEmpty()) arr.add(-1);
                else arr.add(s.peek());
            }
            s.push(A.get(i));
        }
        return arr;
    }
    public static ArrayList<Long> nextLargerElement(long[] arr, int n) {
        Stack<Long> s = new Stack<>();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty()) list.add((long) -1);
            else if (s.peek() < arr[i]) list.add(s.peek());
            else if (s.peek() >= arr[i]) {
                while (!s.isEmpty() && s.peek() >= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) list.add((long) -1);
                else list.add(s.peek());
            }

            s.push(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(10);
        arr.add(8);
//        System.out.println(arr);
//        System.out.println(prevSmaller(arr));
        long[]  as = {4, 5, 2, 10, 8};
        System.out.println(nextLargerElement(as, as.length));
        System.out.println(prevSmaller(arr));
    }
}
