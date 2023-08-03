package Recursion;
import java.util.*;
public class generateParenthesis {
    public static List<String> generateParenthesiss(int n) {
        List<String> arr = new ArrayList<>();
        int open = n;
        int close = n;
        String output = "";
        helper(arr, open, close, output);
        return arr;
    }
    static void helper(List<String> list, int open , int close, String output){
        if(open == 0 && close == 0){
            list.add(output);
            return;
        }

            if(open != 0) {
                String op1 = output + "(";
                helper(list, open-1, close, op1);
            }
           if(open <close){
                String op2 =output+ ")";
                helper(list, open, close-1, op2);
            }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesiss(n));
    }
}
