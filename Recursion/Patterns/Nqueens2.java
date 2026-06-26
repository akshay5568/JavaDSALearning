package Recursion.Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Nqueens2 {
    public static void main(String[] args) {

    }

    public int totalNQueens(int n) {
        List<List<String>> Queens = new ArrayList<>();
        int r = 0; int col = 0;
        String [] [] arr = new String[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = ".";
            }
        }
        BackTrac(arr,Queens,r,col);
        return Queens.size();
    }

    public static boolean isValidQ(int r,int col,String [][] arr){
        //D
        int dulR = r;
        int dulCol = col;
        while(r >= 0 && col >= 0){
            if (Objects.equals(arr[r][col], "Q")) return false;
            r--; col--;
        }

        r = dulR;
        col = dulCol;
        while(r >= 0 && col < arr.length){
            if (arr[r][col] == "Q") return false;
            r--; col++;
        }

        r = dulR;
        col = dulCol;
        while(r >= 0){
            if (arr[r][col] == "Q") return false;
            r--;
        }

        return true;
    }

    public static void BackTrac(String [][] arr,List<List<String>>temp,int r, int col){
        if (r == arr.length || col == arr.length){
            List<String> s = new ArrayList<>();
            for (int i=0; i<arr.length; i++){
                String str = "";
                for (int j=0; j<arr.length; j++){
                    str += arr[i][j];
                }
                s.add(str);
            }
            temp.add(new ArrayList<>(s));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(isValidQ(r,i,arr)){
                arr[r][i] = "Q";
                BackTrac(arr,temp,r+1,i);
                arr[r][i] = ".";
            }
        }
    }
}
