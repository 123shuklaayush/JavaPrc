package Recursion;

import java.util.*;

public class reverseAStack {
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;
        int num = s.peek();
        s.pop();
        reverse(s);
        insert(s, num);
    }
    static void insert(Stack<Integer> s, int num){
        if(s.isEmpty()){
            s.push(num);
            return;
        }
        int n= s.peek();
        s.pop();
        insert(s, num);
        s.push(n);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(7);
        s.push(6);
        reverse(s);
        System.out.println(s);
    }
}
