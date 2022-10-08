package SlidingWindow;

public class maximumOfAllSubArrays {
    public static int printmax(int[] arr, int k){
//        {13, 2, 4, 5, 6}
        int i=0, j=0;
        int sum = 0;
        int maxSum = 0;
        while(j<arr.length){
            sum +=arr[j];
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1==k){
                maxSum = Math.max(sum, maxSum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -1, -4};
        System.out.println(printmax(arr, 3));
    }
}
