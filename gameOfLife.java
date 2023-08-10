import java.util.ArrayList;
import java.util.Arrays;

public class gameOfLife {
    public static void gameOfLife(int[][] board) {
        ArrayList<Integer> arr = new ArrayList<>();
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                int freq = 0;
                if( i+1 < row && j+1 < col ){
                    if(board[i+1][j+1] == 1){
                        freq++;
                    }
                }
                if( i-1 >= 0 && j-1 >= 0 ){
                    if(board[i-1][j-1] == 1){
                        freq++;
                    }
                }
                if( i+1 < row ){
                    if(board[i+1][j] == 1){
                        freq++;
                    }
                }
                if( j+1 < col ){
                    if(board[i][j+1] == 1){
                        freq++;
                    }
                }
                if( j-1 >= 0 ){
                    if(board[i][j-1] == 1){
                        freq++;
                    }
                }
                if( i-1 >= 0 ){
                    if(board[i-1][j] == 1){
                        freq++;
                    }
                }
                if( i - 1 >=0 && j + 1 < col){
                    if(board[i-1][j+1] == 1){
                        freq++;
                    }
                }
                if( i + 1 < row && j - 1 >= 0){
                    if(board[i+1][j-1] == 1){
                        freq++;
                    }
                }
                if( freq < 2 && board[i][j] == 1){
                    arr.add(0);
                }
                else if( freq >=2 && freq <= 3 && board[i][j] == 1){
                    arr.add(1);
                }
                else if( freq > 3 && board[i][j] == 1){
                    arr.add(0);
                }
                else if( freq == 3 && board[i][j] == 0){
                    arr.add(1);
                }
                else if( freq > 3){
                    arr.add(0);
                }
                else
                    arr.add(0);
            }
        }
        int idx = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                board[i][j] = arr.get(idx);
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr= {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        gameOfLife(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
