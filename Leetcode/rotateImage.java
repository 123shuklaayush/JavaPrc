package Leetcode;
import java.util.*;
public class rotateImage {
    public static void rotate(int[][] mat) {
        ArrayList<Integer> arr = new ArrayList<>();
        int rowSize = mat.length;
        int colsSize = mat.length;
        int numOfElements = rowSize * colsSize;

        int startRow = 0;
        int startCols = 0;
        int endRow = rowSize -1;
        int endCols = colsSize-1;

        while(startCols <= endCols){
            for(int i = endRow; i>= startRow; i--){
                arr.add(mat[i][startCols]);
            }
            startCols++;
        }
        int l =0;
        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                mat[i][j] = arr.get(l);
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        Arrays.sort(arr);
        for(int i = 0; i< arr.length ;i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
