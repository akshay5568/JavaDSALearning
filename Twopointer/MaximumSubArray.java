package Twopointer;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int [] arr = {5,4,-1,7,8};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }

    static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int current = 0;
        for(int i=0; i<nums.length; i++){
            current += nums[i];
            if (current > maxSum){
                maxSum = current;
            }
            if (current < 0) current = 0;
        }
        return maxSum;
    }
}
