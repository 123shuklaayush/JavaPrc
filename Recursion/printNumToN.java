package Recursion;

public class printNumToN {
    public static void printNos(int N)
    {
        if(N==0)
            return;
        printNos(N-1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        int num = 3;
        printNos( 5);
    }
}
