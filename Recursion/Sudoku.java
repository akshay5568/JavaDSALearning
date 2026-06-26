package Recursion;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        char [][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
            sudokuBack(board);
    }


    public static boolean sudokuBack(char [][] board){
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (board[i][j] == '.'){
                   for (char k = '1'; k<='9'; k++){
                       if (isValidPalceToPut(board,i,j,k)){
                           board[i][j] = k;
                           printBoard(board);
                           System.out.println("------------------");
                           if (sudokuBack(board)) return true;
                           board[i][j] = '.';
                           printBoard(board);
                           System.out.println("------------------");
                       }
                   }
                   return false;
                }
            }
        }
        return true;
    }


    public static void printBoard(char [][] board){
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static boolean isValidPalceToPut(char[][] borad, int row, int col,int targetNumber){
        //For row;
        for (int i=0; i<9; i++){
            if (borad[i][col] == targetNumber) return false;
        }

        //For col;
        for(int i=0; i<9; i++) {
            if (borad[row][i] == targetNumber) return false;
        }

        //For 3 * 3 board;
        int end = 0;
        if (row >= 0 && 2 >= row){
            row = 0;
            end = 2;
        }else if (row >= 3 && 5 >= row){
            row = 3;
            end = 5;
        }else {
            row = 6;
            end = 8;
        }

        int endCol = 0;
        if (col >= 0 && 2 >= col){
            col = 0;
            endCol = 2;
        }else if (col >= 3 && 5 >= col){
            col = 3;
            endCol = 5;
        }else {
            col = 6;
            endCol = 8;
        }

        for (int i=row; i<=end; i++){
            for (int j=col; j<= endCol; j++){
                if (borad[i][j] == targetNumber) return false;
            }
        }


        //Above all the cases did not satisfy condition now we would have to return true;
        return true;
    }
}
