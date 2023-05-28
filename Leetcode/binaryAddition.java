package Leetcode;

import java.util.Collections;

public class binaryAddition {
        public static String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int i = a.length() - 1, j = b.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0) {
                int sum = carry;
                if (i >= 0)
                    sum += a.charAt(i--) - '0';
                if (j >= 0)
                    sum += b.charAt(j--) - '0';
                if (sum > 1) carry = 1;
                else carry = 0;
                sb.append(sum % 2);
            }
            if (carry != 0) sb.append(Integer.toString(carry));
            return sb.reverse().toString();

        }
    public static void main(String[] args) {
        String a = "1011";
        String b = "1010";
        System.out.println(addBinary(a, b));
        }
    }
