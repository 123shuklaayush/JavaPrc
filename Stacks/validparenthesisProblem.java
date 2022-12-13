package Stacks;
import java.util.*;
public class validparenthesisProblem {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s = new Stack<>();
        for(int i =0; i< x.length(); i++){
            char c = x.charAt(i);
            if(c == '(')
                s.push(')');
            else if(c == '{')
                s.push('}');
            else if(c == '[')
                s.push(']');
            else if(s.isEmpty() || s.pop() != c)
                return false;
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{}()[][]";
        System.out.println(ispar(s));
    }
}
