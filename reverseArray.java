public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newArr = new int[arr.length];
        int m = arr.length-1;
        for(int i = 0; i< arr.length; i++){
            newArr[m] = arr[i];
            m--;
        }
        for(int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
