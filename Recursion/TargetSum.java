package Recursion;

import java.beans.Expression;

public class TargetSum {
    public static void main(String[] args) {
            int [] arr = {1,1,1,1,1};
            int ans = findTargetSumWays(arr,3);
            System.out.println(ans);
    }

//    Input: nums = [1,1,1,1,1], target = 3
//    Output: 5
//    Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
//            -1 + 1 + 1 + 1 + 1 = 3
//            +1 - 1 + 1 + 1 + 1 = 3
//            +1 + 1 - 1 + 1 + 1 = 3
//            +1 + 1 + 1 - 1 + 1 = 3
//            +1 + 1 + 1 + 1 - 1 = 3

    public static int findTargetSumWays(int[] nums, int target) {
         findTargetBack(nums,target,0,"", 0,"+");
         return count;
    }

    static int count = 0;
    public static void findTargetBack(int [] nums, int target, int temp, String s, int start, String oprator){
        if (start >= nums.length){
            if (temp == target) count++;
            return;
        }
        findTargetBack(nums,target,temp + nums[start],s += oprator + nums[start],start+1,"+");
        findTargetBack(nums,target,temp - nums[start],s,start+1,"-");
    }

}
