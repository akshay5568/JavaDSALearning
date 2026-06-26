package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
            int [] [] matrix = {
                    {3,7,8},
                    {9,11,13},
                    {15,16,17}
            };
            List<Integer> list = luckyNumbers(matrix);
        System.out.println(list);
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            // Step 1: Find the minimum value in row i
            int minValue = Integer.MAX_VALUE;
            int minColIndex = -1;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minColIndex = j;
                }
            }

            // Step 2: Check if minValue is max in its column
            boolean isLucky = true;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][minColIndex] > minValue) {
                    isLucky = false;
                    break;
                }
            }

            // Step 3: Add if lucky
            if (isLucky) list.add(minValue);
        }

        return list;
    }

}
