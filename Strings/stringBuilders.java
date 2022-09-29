package Strings;
import java.util.*;
public class stringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Shukla");
//        System.out.println(s.charAt(0));
//        System.out.println(s.length());
//        System.out.println(s.insert(2, 'u'));
//        System.out.println(s.delete(6, 7));
//        System.out.println(s.delete(2, 3));
//        System.out.println(s.append(" Is Great"));
        String str = "Ayush";
        System.out.println(s.append(str));
        String b = String.valueOf(s.reverse());
        System.out.println(b);
    }
}
