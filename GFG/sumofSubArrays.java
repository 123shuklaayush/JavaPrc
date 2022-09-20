package GFG;

public class sumofSubArrays {
    public static long subarraySum(int[] a, long n) {
        // code here
        long sum = 0;
        for(int i = 0; i<n; i++){
            sum += ((n-i)*(i+1)*a[i])%1000000007;
        }
        return sum%1000000007;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(subarraySum(arr, arr.length));
    }
}
