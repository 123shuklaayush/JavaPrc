import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int anInt = sc.nextInt();
        for(int j = 0; j<anInt; j++){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[arr.length];
        int m = arr.length-1;
        for(int i = 0; i< arr.length; i++){
            newArr[m] = arr[i];
            m--;
        }
        for(int i = 0; i<newArr.length-1; i++){
            System.out.print(newArr[i] + " ");
        }
        System.out.println(newArr[newArr.length-1]);
    }}
}
