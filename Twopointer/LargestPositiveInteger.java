package Twopointer;

import java.util.Arrays;

public class LargestPositiveInteger {
    public static void main(String[] args) {

    }

    static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i] < 0){
                    if(Math.abs(nums[i]) == nums[j]){
                        return nums[j];
                    }
                }
            }
        }
        return -1;
    }
}
