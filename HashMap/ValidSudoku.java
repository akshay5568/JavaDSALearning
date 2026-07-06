package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public static void main(String[] args){
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }



    static boolean isValidSudoku(char[][] board) {

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(!isTrueRowCol(board,i,j)) return false;
            }
        }
        return true;
    }

    static boolean isTrueRowCol(char[][] board,int row, int col){
        HashMap<Character,Character> hm = new HashMap<>();


        //For Row;
        for(int i=0; i<=8; i++){
            if(hm.containsKey(board[i][col]) && board[i][col] != '.'){
                int temp = hm.get(board[i][col]);
                hm.put(board[i][col], (char) ++temp);
            }else {
                if (board[i][col] != '.'){
                    hm.put(board[i][col],'1');
                }
            }
        }
        for(Map.Entry<Character,Character> entry : hm.entrySet()){
            if(Integer.parseInt(String.valueOf(entry.getValue())) >= 2) return false;
        }
        hm.clear();

        //For Col;
        for(int i=0; i<=8; i++){
            if(hm.containsKey(board[row][i]) && board[row][i] != '.'){
                int temp = hm.get(board[row][i]);
                hm.put(board[row][i],(char)++temp);
            }else {
                if(board[row][i] != '.'){
                    hm.put(board[row][i],'1');
                }
            }
        }
        for(Map.Entry<Character,Character> entry : hm.entrySet()){
            if(Integer.parseInt(String.valueOf(entry.getValue())) >= 2) return false;
        }
        hm.clear();


        //For 3*3;
        int endRow = 0;
        if(row >= 0 && row <= 2){
            row = 0;
            endRow = 2;
        }else if(row >= 3 && 5 >= row){
            row = 3;
            endRow = 5;
        }else {
            row = 6;
            endRow = 8;
        }

        int endCol = 0;
        if(col >= 0 && 2 >= col){
            col = 0;
            endCol = 2;
        }else if(col >= 3 && 5 >= col){
            col = 3;
            endCol = 5;
        }else {
            col = 6;
            endCol = 8;
        }


        for(int i=row; i<=endRow; i++){
            for(int j=col; j<=endCol; j++){
                if(hm.containsKey(board[i][j]) && board[i][j] != '.'){
                    int temp = hm.get(board[i][j]);
                    hm.put(board[i][j],(char)++temp);
                }else {
                    if (board[i][j] != '.'){
                        hm.put(board[i][j],'1');
                    }
                }
            }
        }

        for(Map.Entry<Character,Character> entry : hm.entrySet()){
            if(Integer.parseInt(String.valueOf(entry.getValue())) >= 2) return false;
        }
        hm.clear();

        return true;
    }
}
