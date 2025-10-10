package Sorting;

import java.util.Arrays;

public class Inserstion {
    public static void main(String[] args) {
        int [] arr = {1,2,5,87,3,6};
        inserstion(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void inserstion(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j>0; j--){
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else break;
            }
        }
    }
}


