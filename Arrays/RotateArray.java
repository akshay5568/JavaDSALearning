package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }



    static void rotate(int[] nums, int k) {
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



    //Although this code is also fine but this is not good for big array that's why we got time limit
    // exeeded error while last case in Leetcode.
    static void rotate2(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        int count = 0;
        while(count != k){
            int temp = nums[nums.length-1];
            slideArray(nums);
            nums[0] = temp;
            j--;
            count++;
        }
    }

    static void slideArray(int [] nums){
        for(int i=nums.length-1; i>0; i--){
            int temp = nums[i-1];
            nums[i] = temp;
        }
    }
}
