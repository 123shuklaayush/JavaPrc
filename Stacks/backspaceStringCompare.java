package Stacks;

import java.util.Stack;

public class backspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer>  b= new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if (s.charAt(i) != '#'){
                a.push((int) s.charAt(i));
            }
            else if(s.charAt(i) == '#' && !a.isEmpty())
                a.pop();
        }

        for(int i = 0; i< t.length(); i++){
            if (t.charAt(i) != '#'){
                b.push((int) t.charAt(i));
            }
            else if(t.charAt(i) == '#' && !b.isEmpty())
                b.pop();
        }
        return a.equals(b);
    }
    public static void main(String[] args) {
        String s= "ab##";
        String t = "c#d#";
        System.out.println(backspaceCompare(s, t));
    }
}
