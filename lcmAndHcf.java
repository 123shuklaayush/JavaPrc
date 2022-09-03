import java.util.Scanner;

public class lcmAndHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i,j;
        for(i = Math.max(a, b); i<a*b; i++){
            if(i %a==0 && i%b ==0){
                break;
            }
        }
        System.out.println(i);
        for(j = Math.min(a,b); j>=1; j--){
            if(a%j == 0&& b%j== 0){
                break;
            }
        }
        System.out.println(j);
    }
}
