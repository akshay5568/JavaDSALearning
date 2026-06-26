package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5};
        int [] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static  int [] mergeSort(int [] arr){
         if (arr.length <= 1 ) return arr;
         int mid = arr.length/2;
         int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
         int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length-1));
         return merge(left,right);
    }

    static int [] merge(int [] left, int [] right){
         int [] temp = new int[left.length + right.length];
         int count = 0;
         for(int i=0; i<left.length; i++){
             temp[count] = left[i];
             count++;
         }
         for(int k=0; k<right.length; k++){
             temp[count] = right[k];
             count++;
         }
         Arrays.sort(temp);
         return temp;
    }
}
