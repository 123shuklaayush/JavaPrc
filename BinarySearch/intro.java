package BinarySearch;

public class intro {
    public static int binarySearch(int[] nums, int tar){
        int i = 0;
        int j = nums.length-1;
        while( j >= i){
            int mid = i + (j-i)/2;
            if(tar < nums[mid]){
                j= mid-1;
            }
            else if( tar > nums[mid]){
                i= mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // Complexity - O(log n)
        System.out.println(binarySearch(arr, 4));
    }
}
