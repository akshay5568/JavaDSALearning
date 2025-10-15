package Shorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,7,89,5,3,89};
        SelectionNew(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int end = arr.length-i-1;
            int max = maxIndex(arr, 0,end);
            swap(arr,max,end);
        }

    }

     static int maxIndex(int[] arr,int start ,int end) {
        int max = start;
         for (int i = start; i <= end; i++ ){
             if (arr[i] > arr[max]){
                 max = i;
             }
         }
        return max;
    }



    static void SelectionSort(int [] arr){
        for (int i =0; i < arr.length; i++){
            int end = arr.length - i - 1;
            int maxIndex = MAX(arr,0,end);
            swap(arr,maxIndex,end);
        }
    }

    static void swap(int []arr, int max, int end){
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }

    static int MAX(int [] arr,int start,int end){      
        int max = -122;
        int max2 = 0;
        for (int i = start; i <= end; i++){
            if (arr[i] > max){
                max = arr[i];
                max2 = i;
            }
        }
        return max2;
    }


    static int [] SelectionNew(int [] arr){
        for (int i=0; i<arr.length; i++){
            int end = arr.length-i-1;
            int MaxNumber = MaxNum(arr,0,end);
            swapArr(arr,MaxNumber,end);
        }
        return arr;
    }

    static int MaxNum(int [] arr,int start, int end){
         int maxVale = Integer.MIN_VALUE;
         int maxIndex = 0;
         for (int i=start; i <= end; i++){
             if (arr[i] > maxVale){
                 maxVale = arr[i];
                 maxIndex = i;
             }
         }
         return maxIndex;
    }

    static int [] swapArr(int [] arr, int MaxNumber, int end){
        int temp = arr[MaxNumber];
        arr[MaxNumber] = arr[end];
        arr[end] = temp;
        return arr;
    }


}
