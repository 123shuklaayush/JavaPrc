package Stacks;

import java.util.Stack;

public class evaluatePostfixExpression {
    public static int evaluatePostfix(String str){
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i< str.length(); i++){
            int s1 = 0;
            int s2 = 0;
            if(str.charAt(i) != '+' || str.charAt(i) != '-' || str.charAt(i) != '*' || str.charAt(i) != '/')
                s.push((int)str.charAt(i));
            else{
                s1 = s.pop();
                s2 = s.pop();
                int res = 0;
                if(str.charAt(i) == '+')
                    res = s1 + s2;
                else if(str.charAt(i) == '-')
                    res = s1 -s2;
                else if(str.charAt(i) == '*')
                    res = s1 *s2;
                else if(str.charAt(i) == '/')
                    res = s1/s2;
                s.push(res);
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String str = "231*+9-";
        System.out.println(evaluatePostfix(str));
    }
}
