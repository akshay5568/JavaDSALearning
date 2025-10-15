package Shorting;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {7};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    static int firstMissingPositive(int [] arr){
         int i = 0;
         while(arr.length > i){
             int rightIndex = arr[i]-1;
             if (arr[i] >= 1 && arr.length >= arr[i] && arr[i] != arr[rightIndex]){
                 int temp = arr[rightIndex];
                 arr[rightIndex] = arr[i];
                 arr[i] = temp;
             }else i++;
         }

        for (int index = 0; index < arr.length; index++) {
             if (arr[index] != index+1){
                 return index+1;
             }
        }
       return arr.length + 1;
    }
}
