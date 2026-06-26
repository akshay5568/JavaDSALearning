package Arrays;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
         int [] [] arr = {
                 {1,2},
                 {3,4},
                 {5,6}
         };
         int  [] [] ans = matrixReshape(arr,2,3);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r * c) != (mat.length * mat[0].length)){
            return mat;
        }
        int [] [] arr = new int[r][c];

        System.out.println(Arrays.deepToString(arr));

        int rIndex = 0;
        int cIndex = 0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                arr[rIndex][cIndex] = mat[i][j];
                System.out.println(Arrays.deepToString(arr));
                cIndex++;
                if (c == cIndex){
                    cIndex = 0;
                    rIndex++;
                }
            }
        }
        return arr;
    }

}
