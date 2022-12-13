package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> arr = new ArrayList<>();
        int rowSize = mat.length;
        int colsSize = mat[0].length;

        int count = 0;
        int total = rowSize * colsSize;

        int startingRow = 0;
        int startingCols = 0;
        int endingRow = rowSize -1;
        int endingCols = colsSize-1;
        while(total > count){
            for(int i = startingCols ;total > count&& i<= endingCols ; i++){
                arr.add(mat[startingRow][i]);
                count++;
            }
            startingRow++;
            for(int i = startingRow;total > count && i<= endingRow; i++){
                arr.add(mat[i][endingCols]);
                count++;
            }
            endingCols--;
            for(int i = endingCols; total > count&& i>= startingCols; i--){
                arr.add(mat[endingRow][i]);
                count++;
            }
            endingRow--;
            for(int i = endingRow;total > count&&  i>= startingRow; i--){
                arr.add(mat[i][startingCols]);
                count++;
            }
            startingCols++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10},
                {11, 12, 13, 14},
                {15, 16, 17, 18}
        };
        System.out.println(spiralOrder(mat));

    }
}
