package Twopointer;

import java.util.ArrayList;
import java.util.List;

public class PanCakeSorting {
    public static void main(String[] args) {
        int [] arr = {3,2,4,1};
        List<Integer> ans = pancakeSort(arr);
        System.out.println(ans);
    }

    static List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            int max = maxElement(arr, i);
            list.add(arr[max]);
            swap(arr,max,i);
        }
        return list;
    }

    static int maxElement(int [] arr,int length){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i=0; i<=length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int [] arr, int swapingIndex, int withSwapIndex){
        int temp = arr[withSwapIndex];
        arr[withSwapIndex] = arr[swapingIndex];
        arr[swapingIndex] = temp;
    }
}
