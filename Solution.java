import java.util.*;
class Solution {
    public static List<String> letterCasePermutation(String s) {
        Set<String> list = new HashSet<>();
        String ip= s;
        String op = "";
        helper(list, ip, op);
        List<String> l = new ArrayList<>(list);
        return l;

    }
    static void helper(Set<String> list, String input, String output){
        if(input.isEmpty()){
            list.add(output);
            return;
        }
        String op1 = output + input.charAt(0);
        String op2 = output + input.toUpperCase().charAt(0);
        char c = input.charAt(0);
        input = input.substring(1);
        helper(list, input, op1);
        if(Character.isLowerCase(c))
            helper(list, input, output + Character.toUpperCase(c));
        else
            helper(list, input, output + Character.toLowerCase(c));
    }
    public static void main(String[] args) {
        String s = "C";
        System.out.println(letterCasePermutation(s));
    }
}
