package Recursion.Patterns;

import java.util.Arrays;

public class Nqueens {
    public static void main(String[] args) {
        int [] [] arr = new int[4][4];
          printQueen(arr,1 );
         System.out.println(Arrays.deepToString(arr));
    }

    static void printQueen(int [] [] arr, int r){
        if (r == arr.length){
            return;
        }
        else{
            for (int j=0; j<arr.length; j++){
                boolean is = true;
                for (int i=0; i<r-1; i++){
                    if (arr[j][i] == j || arr[j][i] == j + r - i || arr[j][i] == j - r + i) {
                        is = false;
                        break;
                    }
                }
                if (is) {
                    arr[j][r] = 1;
                    printQueen(arr,r+1);
                }
            }
        }
    }
}
