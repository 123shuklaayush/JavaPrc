import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        char res = 0;
        for(int i= s.length(); i>=s.charAt(0); i--){
            res = s.charAt(i);
        }
        System.out.println(res);

    }
}
