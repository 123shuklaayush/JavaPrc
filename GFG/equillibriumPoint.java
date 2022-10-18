package GFG;

public class equillibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        long totalSum = 0;
        long tempSum = 0;

        for(Long l:arr) {
            totalSum = l + totalSum;
        }
        for(int i=0;i<arr.length;i++) {

            if((totalSum - tempSum - arr[i]) == tempSum) {
                return i + 1;
            }
            tempSum = tempSum + arr[i];
        }
        return -1;

    }
}
