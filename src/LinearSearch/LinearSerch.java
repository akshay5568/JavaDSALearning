package LinearSearch;

import java.util.Arrays;

public class LinearSerch {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,3,4},
                {5,6,7},
                {8,9,10}
        };

        int target = 10;
        int [] ans = dubbleArr(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int LinearSearch (int [] arr , int traget){
        for (int i =0; i < arr.length; i++){
            if (traget == arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int [] dubbleArr (int [] [] arr , int target) {
        for (int row = 0; row < arr.length; row++ ){
            for (int col = 0; col < arr[row].length; col++ ){
                if (target == arr[row][col]) return new int[]{row,col};
            }
        }
        return new int[] {-1};
    }
}
