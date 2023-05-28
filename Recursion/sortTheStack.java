package Recursion;

import java.util.Collections;
import java.util.Stack;

public class sortTheStack {
    public static Stack<Integer> sort(Stack<Integer> s)
    {
        if(s.isEmpty()) return s;
        int num = s.peek();
        s.pop();
        sort(s);
        insert(s, num);
        return s;
    }
    public static void insert(Stack<Integer> s, int num){
        if(s.isEmpty() || s.peek()<=num){
            s.push(num);
            return;
        }
        int n = s.peek();
        s.pop();

        insert(s,num);

        s.push(n);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 3};
        Stack<Integer> s =new Stack<>();
        s.push(2);
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(3);
        System.out.println(s);
        System.out.println(sort(s));
    }
}
