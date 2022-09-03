import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        int ans = 0;
        while(num>0){
            int mod = num%10;
            ans = ans *10 + mod;
            num = num/10;
        }
        if(N == ans){
            System.out.println("THey are same");
        }
        else{
            System.out.println("Looks different");
        }
    }
}
