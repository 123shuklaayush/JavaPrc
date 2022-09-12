package Strings;

public class reverseString {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hedllo.I.am");
        //METHOD 1 BRUTE FORCE
//        String b = "";
//        for(int i =a.length()-1; i>=0; i--){
//            b = b + a.charAt(i);
//        }
//        System.out.println(b);

        for(int i= 0; i< a.length()/2; i++){
            int front = i;
            int back = a.length() -1-i;
            char frontChar = a.charAt(front);
            char backChar = a.charAt(back);
            a.setCharAt(front, backChar);
            a.setCharAt(back, frontChar);
        }
        System.out.println(a);
    }
}
