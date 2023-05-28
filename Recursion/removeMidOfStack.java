package Recursion;

import java.util.*;

public class removeMidOfStack {
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        int count = sizeOfStack/2+1;
        if(s.isEmpty()) return;
        solve(s, count, sizeOfStack);
    }

    private static void solve(Stack<Integer> s, int count, int sizeOfStack) {
        if(count == 1){
            s.pop();
            return;
        }
        int num = s.peek();
        s.pop();
        solve(s, count-1, sizeOfStack);
        s.push(num);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        deleteMid(s, s.size());
        System.out.println(s);
    }
}
