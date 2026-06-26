package Recursion;

import java.util.Arrays;

public class UniquePaths3 {
    public static void main(String[] args) {
        int [][] grid = {
                {1,0,0,0},
                {0,0,0,0},
                {0,0,2,-1},
        };
        System.out.println(uniquePathsIII(grid));
    }


//    Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
//    Output: 2
//    Explanation: We have the following two paths:
//    1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2);
//    2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2);

    static int result = 0; static int empty = 1;
    public static int uniquePathsIII(int[][] grid) {
        int sR = 0; int sC = 0;
          for (int i=0; i<grid.length; i++){
              for (int j=0; j<grid[i].length; j++){
                  if (grid[i][j] == 0) empty++;
                  else if (grid[i][j] == 1){
                      sR = i; sC = j;
                  }
              }
          }
         uniqueBackTrack(grid,sC,sR);
         return result;
    }



    public static void uniqueBackTrack(int [][] grid, int col, int row){
        if (col < 0 || row < 0 ||  row >= grid.length || col >= grid[row].length  || grid[row][col] < 0) return;
        if (grid[row][col] == 2){
            if (empty == 0) result++;
            return;
        }
        grid[row][col] = -87;
        printeGrid(grid);
        empty--;
        uniqueBackTrack(grid,col+1,row);
        uniqueBackTrack(grid,col-1,row);
        uniqueBackTrack(grid,col,row+1);
        uniqueBackTrack(grid,col,row-1);
        empty++;
        grid[row][col] = 0;
        printeGrid(grid);
    }

    public static void printeGrid(int [][] grid){
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                System.out.print(" " + grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
