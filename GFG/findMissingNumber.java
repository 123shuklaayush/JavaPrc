package GFG;
//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
//
//        Example 1:
//
//        Input:
//        N = 5
//        A[] = {1,2,3,5}
//        Output: 4
public class findMissingNumber {
    static int MissingNumber(int[] array, int n) {
        // Your Code Here
        int sum = (n * (n + 1)) / 2;
        int real = 0;
        for (int i = 0; i < n - 1; i++) {
            real = real + array[i];
        }
        int diff = sum - real;
        return diff;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 5};
        int res = MissingNumber(arr, n);
        System.out.println(res);
    }
}
