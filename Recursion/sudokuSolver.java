package Recursion;

public class sudokuSolver {
    public void solveSudoku(char[][] board) {
        helper(board);
    }

    public boolean helper(char[][] board){
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c<= '9'; c++){
                        if(isValid(board, i, j, c)){
                            board[i][j] = c;

                            if(helper(board) == true) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i< 9; i++){
            if(board[i][col] == c){
                return false;
            }
            if(board[row][i] == c){
                return false;
            }
            if(board[3*(row/3) + i/3][3* (col/3)+ i % 3] == c) return false;
        }
        return true;
    }
}
