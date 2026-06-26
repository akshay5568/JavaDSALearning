package Basics;

import java.math.BigInteger;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotate2(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        for(int i=0; i<k; i++){
            int temp = nums[nums.length-1];
            swap(nums,temp);
        }
    }

    static void swap(int [] arr, int temp){
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }

    static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0) return;
        int [] temp = new int[nums.length];
        int index = 0;
        for(int i=nums.length-k; i<nums.length; i++){
            temp[index] = nums[i];
            index++;
        }

        for(int j=0; j<nums.length-k; j++){
            temp[index] = nums[j];
            index++;
        }

        for(int p =0; p<nums.length; p++){
            nums[p] = temp[p];
        }
    }
}