package Arrays;

public class MatrixDignalsSum {
    public static void main(String[] args) {
        int [] [] mat = {{5}};
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }

    static int diagonalSum(int[][] mat) {
        int i = 0;
        int j = mat.length-1;
        int ans = 0;

        while(j != -1){
            if(i == j){
                ans += mat[j][j];
            }else {
                ans += mat[i][i] + mat[i][j];
            }
            j--;
            i++;
        }
        return ans;
    }
}
