package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsec {
    public static void main(String[] args) {
        int [] nums = {4,3,7,7};
        List<List<Integer>> ans = findSubsequences(nums);
        System.out.println(ans);
    }

//    Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements.
//    You may return the answer in any order.
//
//    Input: nums = [4,6,7,7]
//    Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]

    public static List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        findSubseBack(nums,new ArrayList<>(),0, set);
        return new ArrayList<>(set);
    }


    public static void findSubseBack(int [] nums, List<Integer> temp, int index, Set<List<Integer>> set){
        if (index == 1) System.out.println(index + "Helo");
        if (index >= nums.length){
            if (temp.size() >= 2){
                set.add(new ArrayList<>(temp));
            }
            System.out.println(temp);
            return;
        }
        if (temp.isEmpty() || temp.getLast() <= nums[index]){
            temp.add(nums[index]);
            findSubseBack(nums,temp,index+1,set);
            temp.removeLast();
        };
        findSubseBack(nums,temp,index+1,set);
    }


}
