package Recursion;

public class powerAndRoots {
    public static int powerRoots(int p, int x){
        if(x == 0){
            return 1;
        }
        int store = powerRoots(p, x-1);
        int res = store * p;
        return res;
    }
    public static void main(String[] args) {
        int a= 4;
        System.out.println(powerRoots(2, 4));
    }

    // Special Case if power is log (See the first video of recursion by apna college last question)
}
