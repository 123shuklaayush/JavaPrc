package GFG;

public class rearrangeArrayAlternatively {
    public static void rearrange(long arr[], int n){

        // Your code here
        int[] newArr = new int[arr.length];
        int num = arr.length-1;
        int initialNum = 0;
        for(int i = 0; i< arr.length ; i+=2){
            newArr[i] = (int) arr[num];
            num--;
        }
        for(int j = 1; j<arr.length; j+=2){
            newArr[j] = (int) arr[initialNum];
            initialNum++;
        }

    }

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        rearrange(arr, n);
    }
}
