package Matrices;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        int index = 0;
        List<Integer> list = new ArrayList<>();
        int r = 0;
        int c = 0;
        int total = matrix.length * matrix[0].length;

        while (list.size() < total) {

            for (int j = c; j <=matrix[0].length - 1 - index && list.size() < total; j++) {
                list.add(matrix[r][j]);
            }
            System.out.println(list);

            r++;
            for (int j = r; j <= matrix.length - 1 - index && list.size() < total; j++) {
                list.add(matrix[j][matrix[0].length - 1 - index]);
            }

            System.out.println(list);

            for (int j = matrix[0].length - 2 -index; j >= c && list.size() < total; j--) {
                list.add(matrix[matrix.length- 1 - index][j]);
            }


            for (int j = matrix.length - 2 - index; j >= r && list.size() < total; j--) {
                list.add(matrix[j][c]);
            }
            index++;
            r = index;
            c = index;
            System.out.println(list);
        }
        return list;
    }
}
