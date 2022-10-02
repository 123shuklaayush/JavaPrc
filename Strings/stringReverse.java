package Strings;

import java.util.Collections;

public class stringReverse {
    static String conRevstr(String S1, String S2) {
        StringBuilder sc = new StringBuilder();
        sc.append(S1);
        sc.append(S2);

        // code here
        String s = String.valueOf(sc.reverse());

        return s;
    }

    public static void main(String[] args) {
        String s1 = "me";
        String s2 = "ayu";
        System.out.println(conRevstr(s1, s2));
    }
}
