package Contest;
import java.util.*;
public class mexArray {
    public static int[] moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
        return nums;
    }
    public static int[] mexArray(int n, int a[]){
        Arrays.sort(a);
        moveZeroes(a);
        int[] ans = new int[a.length];
        int k = 1;
        for(int i = 0; i<ans.length; i++){
            if(k == a[i]){
                ans[i] = k;
                k++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr= {0, 1, 2};
        int n = 3;
        System.out.println(Arrays.toString(mexArray(n, arr)));

    }
}
