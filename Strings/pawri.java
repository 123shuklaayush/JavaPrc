package Strings;

import java.util.Scanner;

public class pawri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //MY APPROACH BUT SOME ERROR
        for(int j = 0; j< a; j++){
            String s1 = sc.next();
        StringBuilder str =new StringBuilder (s1);
        for(int i = 0; i<str.length(); i++){
            String s = str.substring(i, Math.min(i+5, str.length()));
            if(s.equals("party")){
                str.replace(i, i+5, "pawry");
            }
        }
            System.out.println(str);
        }
//        String m= "party";
//        //SEEDHA SEEDHA APPROACH
//        for(int i = 0; i<a; i++){
//            String s = m.replaceAll("party", "pawri");
//            System.out.println(s);
//        }


    }
}
