package Twopointer;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,0,0,8,9,9,9,9,9,9};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                int r;
                for(r = arr.length - 2; r > i; r--){
                    arr[r+1] = arr[r];
                }
                arr[r+1] = 0;
                i = i + 1;
            }
        }
    }
}
