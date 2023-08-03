package BinarySearch;

public class countOfElementInASortedArray {
    int count1(int[] nums, int n, int target) {
        int i = 0;
        int j = nums.length-1;
        int res = -1;
        while( j >= i){
            int mid = i + (j-i)/2;
            if(target == nums[mid]){
                res = mid;
                j = mid-1;
            }
            else if( target > nums[mid]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return res;
    }
    static int count2(int[] nums, int n, int target){
        int i = 0;
        int j = nums.length-1;
        int res2 = -1;
        while( j>= i){
            int mid = i + (j-i)/2;
            if(target ==nums[mid]){
                res2 =mid;
                i = mid +1;
            }
            else if(target > nums[mid]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return res2;
    }
    int count(int[] arr, int n, int x) {
        int start = count1(arr, n, x);
        int end = count2(arr, n, x);
        if(start == -1 && end ==-1) return 0;
        return end - start+1;
    }

    public static void main(String[] args) {

    }
}
