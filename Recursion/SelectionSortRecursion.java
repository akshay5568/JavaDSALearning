package Recursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
            int [] arr = {3,2,1,4};
            SelectionRec(arr,arr.length-1);
            System.out.println(Arrays.toString(arr));
    }

    public static void SelectionRec(int [] arr, int i){
        if (i == -1) return;
        int max = maxElement(arr,i);
        if (arr[max] > arr[i]){
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        SelectionRec(arr,i-1);
    }

    public static int maxElement(int [] arr,int end){
        int max = 0;
        for (int i=0; i<=end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
