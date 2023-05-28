package Stacks;

import java.util.ArrayDeque;
import java.util.Stack;
public class removeAllAdjacentDuplicatesIandII {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if(st.isEmpty())
                st.push(s.charAt(i));
            else if(s.charAt(i) == st.peek())
                st.pop();
            else
                st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        sb.reverse();
        return sb.toString();
    }
    public String removeDuplicates(String str, int k) {
        ArrayDeque<pair> arr = new ArrayDeque<>(str.length());
        for(char c : str.toCharArray()){
            if(!arr.isEmpty() && arr.peekLast().value == c)
                arr.peekLast().count++;
            else
                arr.addLast(new pair(c, 1));
            if(arr.peekLast().count == k)
                arr.removeLast();
        }
        StringBuilder sb = new StringBuilder();
        for(pair a: arr)
            sb.append(String.valueOf(a.value).repeat(a.count));
        return sb.toString();
    }
    static class pair{
        char value;
        int count;
        public pair(char value, int count){
            this.value = value;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }
}
