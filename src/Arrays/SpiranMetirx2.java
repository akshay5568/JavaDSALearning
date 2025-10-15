package Arrays;

import java.util.Arrays;

public class SpiranMetirx2 {
    public static void main(String[] args) {
        int ans[][] = generateMatrix(3);
        System.out.print(Arrays.deepToString(ans));
    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1; // number to fill

        while (num <= n * n) {
            // Left → Right
            for (int i = left; i <= right && num <= n * n; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom && num <= n * n; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Right → Left
            for (int i = right; i >= left && num <= n * n; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Bottom → Top
            for (int i = bottom; i >= top && num <= n * n; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }
}



