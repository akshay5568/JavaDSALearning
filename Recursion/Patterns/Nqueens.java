package Recursion.Patterns;

import javax.swing.*;
import java.util.*;

public class Nqueens {
    public static void main(String[] args) {
       List<List<String>> ans = solveNQueens(4);
       System.out.println(ans);
    }


    public static List<List<String>> solveNQueens(int n) {
         List<List<String>> Queens = new ArrayList<>();
         int r = 0; int col = 0;
         String [] [] arr = {{".",".",".","."},{".",".",".","."},{".",".",".","."},{".",".",".","."},};
         BackTrac(arr,Queens,r,col);
         return Queens;
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
                System.out.println(Arrays.deepToString(arr));
                BackTrac(arr,temp,r+1,i);
                arr[r][i] = ".";
                System.out.println(Arrays.deepToString(arr));
                System.out.println("------------------------");
            }
        }
    }

}
