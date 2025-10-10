package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        int ans = cyclic2(arr);
        // System.out.print(Arrays.toString(arr));
        System.out.print(ans);
    }

    static void cyclic(int [] arr){
        int i =0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else i++;
        }
    }

    static int cyclic2(int [] arr){
        int i = 0;
        while (arr.length > i) {
            int correctIndex = arr[i];
            if (arr.length > arr[i] && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j ) {
                return j;
            }
        }
        return arr.length;
    }
}
