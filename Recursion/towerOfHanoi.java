package Recursion;

public class towerOfHanoi {
    public static void tower(int n , String src, String help, String dest){
        if(n ==1){
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return ;
        }
        tower(n-1, src, dest, help);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        tower(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n = 20;
        tower(n, "Source", "Helper", "Destination");

    }
}
