package Matrices;

import java.util.Arrays;

public class SortMatixesByDignal {
    public static void main(String[] args) {
        int [][] grid = {{2,-1},{3,2}};
        System.out.println(Arrays.deepToString(sortMatrix(grid)));
    }

    static int[][] sortMatrix(int[][] grid) {
        int index = 0;

        //upper bound
        while(index != grid.length){
            int r = 0; int c = index;
            while(c != grid.length-1){
                if(grid[r][c] >= grid[r+1][c+1]){
                    int id = grid[r][c];
                    grid[r][c] = grid[r+1][c+1];
                    grid[r+1][c+1] = id;
                    c = index; r = 0;
                    continue;
                }
                r++; c++;
            }
            System.out.print(Arrays.deepToString(grid));
            index++;
        }


        index = 0;
        //For lower Bound
       while (index != grid.length){
           int r = index; int c = 0;
           while (r != grid.length-1){
               if (grid[r][c] <= grid[r+1][c+1]){
                   int temp = grid[r][c];
                   grid[r][c] = grid[r+1][c+1];
                   grid[r+1][c+1] = temp;
                   r = index; c = 0;
                   continue;
               }
               r++; c++;
           }
           index++;
           System.out.println(Arrays.deepToString(grid));
       }

        return grid;
    }
}
