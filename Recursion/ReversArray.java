package Recursion;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int [] srr = {1,2,3,4};
        reversArr(srr,0,srr.length-1);
        System.out.println(Arrays.toString(srr));
    }

    static void reversArr(int [] arr,int i,int j){
        if (i > j){
            return;
        }
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        reversArr(arr,++i,--j);
    }
}
