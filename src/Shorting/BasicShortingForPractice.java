package Shorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicShortingForPractice {
    public static void main(String[] args) {
        int [] arr = {100,90,80,70,60,50,40,30,20,10};
        int [] ans  = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }


    static int [] bubbleSort (int [] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
