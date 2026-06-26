package Arrays;

import java.util.*;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int [][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    static void setZeroes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                }
            }
        }


        for(int i=0; i<list.size(); i=i+2){
            System.out.println(list);
            int getRow = list.get(i);
            int getCol = list.get(i+1);

            for (int p=0; p<matrix.length; p++){
                matrix[p][getCol] = 0;
                System.out.println(Arrays.deepToString(matrix));
            }

            for (int o=0; o<matrix[getRow].length; o++){
                matrix[getRow][o] = 0;
                System.out.println(Arrays.deepToString(matrix));
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }
}
