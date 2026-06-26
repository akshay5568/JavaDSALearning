package Sorting;

import java.util.Arrays;

public class MinimumPair {
    public static void main(String[] args) {

    }

    static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        int temp = 0;
        while(j > i){
            temp = Math.max(temp, nums[i] + nums[j]);
            j--;
            i++;
        }
        return temp;
    }
}
