package Leetcode;

import java.util.Arrays;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }

    public static void main(String[] args) {
        String s = "fluffy is still joyboy";
        System.out.println(lengthOfLastWord(s));

        }
}
