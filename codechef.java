import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTests = sc.nextInt();

        while (numTests-- > 0) {
            int len = sc.nextInt();
            String str = sc.next();

            if (len % 3 == 1) {
                System.out.println("Yes");
                continue;
            }

            boolean flag = false;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                int firstidx = len + 1;
                int lastidx = -1;

                for (int i = 0; i < len; i++) {
                    if (i % 3 == 0 && str.charAt(i) == ch) {
                        firstidx = i;
                        break;
                    }
                }

                for (int i = len - 1; i >= 0; i--) {
                    int x = len - 1 - i;
                    if (x % 3 == 0 && str.charAt(i) == ch) {
                        lastidx = i;
                        break;
                    }
                }

                if (firstidx < lastidx) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}