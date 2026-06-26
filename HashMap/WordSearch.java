package HashMap;

import java.util.HashMap;

public class WordSearch {
    public static void main(String[] args) {
        char str [][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean ans = exist(str,word);
        System.out.println(ans);
    }


    static boolean exist(char[][] board, String word) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<word.length(); i++){
            if(hm.containsKey(word.charAt(i))){
                int countINC = hm.get(word.charAt(i));
                hm.put(word.charAt(i), ++countINC);
            }else{
                hm.put(word.charAt(i),1);
            }
        }

        System.out.println(hm);

        for(int k=0; k<word.length(); k++){
            int temp = 0;

            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    if (board[i][j] == word.charAt(k)){
                        temp++;
                    }
                }
            }
            if(temp < hm.get(word.charAt(k))){
                return false;
            }
        }
        return true;
    }
}
