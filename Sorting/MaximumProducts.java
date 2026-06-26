package Sorting;

import java.util.Arrays;

public class MaximumProducts {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        int ans = maximumProduct(nums);
        System.out.print(ans);
    }

    static int maximumProduct(int[] nums) {
        int count = Integer.MIN_VALUE;
        for(int a=0; a<nums.length-2; a++){
            for(int b =a+1; b<nums.length-1; b++){
                for(int c=b+1; c<nums.length; c++){
                    int productValue = nums[a] * nums[b] * nums[c];
                    if (productValue > count) {
                        count = productValue;
                    }
                }
            }
        }
        return count;
    }
}
