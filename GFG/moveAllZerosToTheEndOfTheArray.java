package GFG;

public class moveAllZerosToTheEndOfTheArray {
    static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[arr.length-1] ;
                    arr[arr.length-1] = temp;
//                    arr[arr.length-1] --;
                }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 0, 5, 0, 0, 1, 0, 0};
        pushZerosToEnd(arr, arr.length);
    }
}
