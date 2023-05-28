package Recursion;

import java.util.*;

public class subsets {
    public static List<String> getSubsequences(String input) {
        List<String> subsequences = new ArrayList<>();
        helper(input, "", subsequences);
        Collections.sort(subsequences);
        return subsequences;
    }
    public static void helper(String input, String output, List<String> subsequences) {
        if (input.isEmpty()) {
            subsequences.add(output);
            return;
        }
        String op1 = output;
        String op2 = output + input.charAt(0);
        input = input.substring(1);
        helper(input, op1, subsequences);
        helper(input, op2, subsequences);
    }

    public static void main(String[] args) {
        String a = "abc";
        System.out.println(getSubsequences(a));
    }
}
