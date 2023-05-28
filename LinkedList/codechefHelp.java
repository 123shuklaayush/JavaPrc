package LinkedList;

import java.util.LinkedHashMap;
import java.util.*;

public class codechefHelp {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int lenOfStr = sc.nextInt();
            String str =sc.next();
            int x= 0;
            for(int i = 0; i< lenOfStr; i++) {
                if (str.charAt(i) == '1') x++;
            }
                if(Math.min((n-x),x)%2 != 0)
                    System.out.println("Zlatan");
                else
                    System.out.println("Ramos");
        }
    }
}
