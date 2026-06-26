package Searching;

import java.util.Arrays;

public class MatixSearching {
    public static void main(String[] args) {
        int [][]nums = {
            {1,2,4},
            {5,6,7},
            {8,9,10}
        };
        int [] ans = matrix(nums, 8);
        System.out.print(Arrays.toString(ans));
    }


    static int[] matrix(int [][] arr, int target){      
        int r = 0;
        int c = arr.length-1;
        while (r < arr.length && c>=0) {
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }
            else if (arr[r][c] < target) {
                r++;
            }
            else c--;
        }
        return new int[]{-1,-1};
    }
}
