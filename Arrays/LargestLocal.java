package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestLocal {
    public static void main(String[] args) {
        int [] [] arr = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int [][] ans = largestLocal(arr);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int [][] maxLocal = new int [n-2][n-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                maxLocal[i][j] = findMax(grid,i,j);
            }
        }
        return maxLocal;
    }

    static int findMax(int [][] grid, int i, int j){
        int maxElement = 0;
        for(int k=i; k<i+3; k++){
            for(int p=j; p<j+3; p++){
                maxElement = Math.max(grid[k][p],maxElement);
            }
        }
        return maxElement;
    }
}


