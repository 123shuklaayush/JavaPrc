import java.util.Scanner;

public class armStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
//        System.out.println(Math.pow(num, 3));
        int add =0;
        int count = 0;
        while(num>0){
            int mod = num%10;
            int cube = (int) Math.pow(mod, 3);
            add = cube + add;
            num = num/10;
        }
        if(add == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    }

