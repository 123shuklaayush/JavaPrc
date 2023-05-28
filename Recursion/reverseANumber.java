package Recursion;

public class reverseANumber {
    public static int revANum(int n){
        if(n == 0) return 0;
        int rev = 0;
        rev = rev * 10 + (n%10) + revANum(n/10);
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(revANum(104));
    }
}
