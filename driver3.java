import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class driver3 {
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
        int s = 19;

        System.out.println(Integer.toBinaryString(s));
    }
}