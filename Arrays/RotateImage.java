package Arrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [] [] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
        System.out.println(Arrays.deepToString(mat));
    }

    static void rotate(int[][] matrix) {
        int n = matrix.length;
        int [] mat = new int[n * n];

        int i = n-1;
        int j = 0;
        int count = 0;
        int index = 0;
        int temp = 0;

        while(count != n){

            if(temp == n){
                i = n-1;
                j++;
                temp = 0;
                count++;
            }
            else{
                mat[index++] = matrix[i][j];
                temp++;
                i--;
            }
        }
        int l = 0;

        for(int k=0; k<n; k++){
            for(int p=0; p<n; p++){
                matrix[k][p] = mat[l];
                l++;
            }
        }

    }
}
