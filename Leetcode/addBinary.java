package Leetcode;

public class addBinary {
    public static String addBinar(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int num = Integer.parseInt("0b");
        return Integer.toString((num+num1 )+ (num+num2));
    }

    public static void main(String[] args) {
        System.out.println(addBinar("11", "1"));
    }
}
