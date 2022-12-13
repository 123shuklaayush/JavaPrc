package BitManipulation;

public class swapTwoNos{
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("The value of a is" + " : " + a);
        System.out.println("The value of b is" + " : " + b);

    }

    public static void main(String[] args) {
        int a = 430;
        int b= 411;
        swap(a,b);
    }
}
