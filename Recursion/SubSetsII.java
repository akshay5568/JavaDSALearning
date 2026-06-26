package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class SubSetsII {
    public static void main(String[] args) {
        int [] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsetsWithDupRec(nums,0,ans,temp);
        return ans;
    }

    static void subsetsWithDupRec(int [] nums,int index, List<List<Integer>> ans, List<Integer> temp){
        if(index >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        subsetsWithDupRec(nums,index+1,ans,temp);
        temp.removeLast();
        boolean is = false;
        if (temp.isEmpty()){
            is = true;
            index = index+1;
        };
        if (!is){
           index = index+1;
        }
        subsetsWithDupRec(nums,index,ans,temp);
    }
}
