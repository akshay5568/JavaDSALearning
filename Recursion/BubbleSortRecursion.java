package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] arr = {3,2,1,4};
        BubbleRec(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleRec(int [] arr,int i, int j){
        if (i == -1) return;
        if (j < i){
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            BubbleRec(arr,i,j+1);
            System.out.println("J'th Recursive code");
        }else{
            BubbleRec(arr,i-1,0);
            System.out.println("I'th Recursive code");
        }
    }
}
