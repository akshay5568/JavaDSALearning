package Sorting;

import java.util.Arrays;

public class ArrayPartision {
    public static void main(String[] args) {

    }

    static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0; i<nums.length; i+=2){
            ans += nums[i];
        }
        return ans;
    }
}
