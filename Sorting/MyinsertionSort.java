package Sorting;

import java.util.Arrays;

public class MyinsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,3,2};
        myInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void myInsertion(int [] arr){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
