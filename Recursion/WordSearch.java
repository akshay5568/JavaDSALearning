package Recursion;

public class WordSearch {
    public static void main(String[] args) {
            char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board,"SEE"));
    }

    public static boolean exist(char [][] board, String word){
        boolean[][] used = new boolean[board.length][board[0].length];
        boolean result = false;
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                if (word.charAt(0) == board[i][j]){
                    result = wordSearchBack(i,j,word,used,board,0);
                    if (result) return true;
                }
            }
        }
        return false;
    }

    public static boolean wordSearchBack(int row, int col, String word, boolean[][] used,char[][] board,int start){
        if (start == word.length()) return true;
        if (0 > row || 0 > col || board.length <= row || board[row].length <= col || used[row][col] || word.charAt(start) != board[row][col]) return false;
        used[row][col] = true;

        boolean result = wordSearchBack(row,col+1,word,used,board,start+1)
                ||wordSearchBack(row,col-1,word,used,board,start+1)
                || wordSearchBack(row+1,col,word,used,board,start+1)
                || wordSearchBack(row-1,col,word,used,board,start+1);
        used[row][col] = false;

        return result;
    }
}
