package Sorting;

import java.util.Arrays;

public class Inserstion {
    public static void main(String[] args) {
        int [] arr = {3,4,1,2};
        inserstion(arr);
        System.out.print(Arrays.toString(arr));
    }

//    static void inserstion(int [] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for(int j=i+1; j>0; j--){
//                if (arr[j-1] > arr[j]) {
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }else break;
//            }
//        }
//    }
    static void inserstion(int [] arr){
        for (int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}


