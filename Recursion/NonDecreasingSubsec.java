package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NonDecreasingSubsec {
    public static void main(String[] args) {
        int [] nums = {4,6,7,7};
        List<List<Integer>> ans = findSubsequences(nums);
        System.out.println(ans);
    }

//    Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements.
//    You may return the answer in any order.
//
//    Input: nums = [4,6,7,7]
//    Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]

    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findSubseBack(nums,new ArrayList<>(),0,ans);
        return ans;
    }


    public static void findSubseBack(int [] nums, List<Integer> temp, int index, List<List<Integer>> ans){
        if (index >= nums.length){
            if (!ans.contains(temp) && temp.size() >= 2) ans.add(new ArrayList<>(temp));
            return;
        }
        if (temp.isEmpty()) temp.add(nums[index]);
        else if (temp.getLast() <= nums[index]) temp.add(nums[index]);
        findSubseBack(nums,temp,index+1,ans);
        if (!temp.isEmpty()) temp.removeLast();
        findSubseBack(nums,temp,index+1,ans);
    }


}
