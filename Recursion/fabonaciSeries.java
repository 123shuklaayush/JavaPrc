package Recursion;

public class fabonaciSeries {
    public static int fabo(int n){
        if( n<=1){
            return n;
        }
        return fabo(n-1) + fabo(n-2);

    }
    public static void main(String[] args) {
        int b= 5;
        for(int i = 0; i< b; i++){
            System.out.print(fabo(i) + " ");
        }

    }
static int fib(int n)
{
    if (n <= 1) {
        return n;
    }
    return fib(n - 1)+ fib(n - 2);
}
}
