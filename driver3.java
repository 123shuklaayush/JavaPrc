import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.function.BinaryOperator;

public class driver3 {


    public static void moveZeroes(int[] nums) {

        int count = 0;
        if(nums.length==1){
            return;
        }
        for(int i = 0; i< nums.length;i++){
            if(nums[i] !=0){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i= 0; i< nums.length; i++){
            nums[count] = 0;
            count++;
        }
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void moveZeroes1(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] !=0){
                arr.add(nums[i]);
            } else if (nums[i] == 0) {
                count++;
            }
        }
        for(int i = 0; i<count; i++){
            arr.add(0);
        }
        for(int i = 0; i< arr.size(); i++){
            nums[i] = arr.get(i);
        }
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        // System.out.print(arr + " " );

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes1(arr);
    }
}