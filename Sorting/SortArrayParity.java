package Sorting;

import java.util.Arrays;

public class SortArrayParity {
    public static void main(String[] args) {
        int [] nums = {3,1,2,4};
        int [] ans = sortArrayByParity(nums);
        System.out.print(Arrays.toString(ans));
    }

    static int[] sortArrayByParity(int[] nums) {
        int [] temp = new int[nums.length];
        int count = 0;
        int end = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp[count] = nums[i];
                count++;
            }
            else {
                temp[end] = nums[i];
                end--;
            }
        }
        return temp;
    }
}
