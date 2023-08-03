package Stacks;
import java.lang.reflect.Array;
import java.util.*;

public class nearrestsmallestelementToTheLeft {
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.size(); i++){
            if(s.isEmpty())
                list.add(-1);
            else if(s.peek() < A.get(i))
                list.add(s.peek());
            else if(s.peek() >= A.get(i)){
                while(!s.isEmpty() && s.peek()>=A.get(i))
                    s.pop();
                if(s.isEmpty()) list.add(-1);
                else list.add(s.peek());
            }
            s.push(A.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(6);
        System.out.println(prevSmaller(arr));
    }
}