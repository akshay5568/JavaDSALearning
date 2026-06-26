package Arrays;

import java.util.Arrays;

public class Convert1dArrayto2d {
    public static void main(String[] args) {
        int[][] ans = construct2DArray(new int[]{1,2} , 1,1);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] construct2DArray(int[] original, int m, int n) {
            if(original.length != n * m){
                return new int[][]{};
            }
            int [][] ans = new int[m][n];
            int count = 0;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    ans[i][j] = original[count];
                    count++;
                }
            }
            return ans;
    }
}
