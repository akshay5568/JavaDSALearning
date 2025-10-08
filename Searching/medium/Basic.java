package Searching.medium;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
         int ans = findDuplicate(nums);
         System.out.println(ans);
    }

     static int findDuplicate(int[] arr) {
        //   for(int i=0; i<arr.length-1; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //          if(arr[i] == arr[j]){
        //             return arr[i];
        //          }
        //     }
        //   }

        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=1; j<arr.length; j++){
        //          if (arr[j-1] > arr[j]) {
        //              int temp = arr[j-1];
        //              arr[j-1] = arr[j];
        //              arr[j] = temp;
        //          }
        //     }
        // }
        Arrays.sort(arr);
        for(int k =1; k<arr.length; k++){
             if (arr[k-1] == arr[k]) {
                return arr[k];
             }
        }
          return -1;
    }
}
