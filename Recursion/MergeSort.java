package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2};
        int [] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static  int [] mergeSort(int [] arr){
         if (arr.length <= 1 ) return arr;
         int mid = arr.length/2;
         int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
         int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
         return merge(arr,left,right);
    }

    static int [] merge(int [] temp, int [] left, int [] right){
         int i =0;
         int j =0;
         int count = 0;
         while(left.length > i && right.length > j){
             if (left[i] < right[j]){
                 temp[count] = left[i];
                 i++;
                 count++;
             }else {
                 temp[count] = right[j];
                 j++;
                 count++;
             }
         }

         while(i < left.length){
             temp[count] = left[i];
             i++;
             count++;
         }

         while(j < right.length){
             temp[count] = right[j];
             j++;
             count++;
         }
         return temp;
    }
}
