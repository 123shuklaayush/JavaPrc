package Recursion;

public class factorial {
    public static int fact(int n){
        if(n == 1 || n ==0){
            return 1;
        }
        int fact = fact(n-1);
        int res = n*fact;
        return res;
    }
    public static void main(String[] args) {
        int n = fact(0);
        System.out.println(n);
    }
}
