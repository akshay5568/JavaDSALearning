package Twopointer;

import java.util.Arrays;

public class FlipSquareSubMatrixVertically {
    public static void main(String[] args) {
        int [] [] arr = {{3,4,2,3},{2,3,4,2}};
        reverseSubmatrix(arr,0,2,2);
        System.out.println(Arrays.deepToString(arr));
    }

    static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int end = x + k - 1;
        int start = x;
        int i = y;
        int j = y;
        int count = 0;
        while(end > start){
            if(k == count){
                end--;
                start++;
                i = y;
                j = y;
                count = 0;
                continue;
            }
            int temp = grid[start][i];
            grid[start][i] = grid[end][j];
            grid[end][j] = temp;
            i++;
            j++;
            count++;
            System.out.println(Arrays.deepToString(grid));
        }
        return grid;
    }
}
