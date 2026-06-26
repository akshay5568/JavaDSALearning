package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsLeetCode {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        SubSetRec(nums,0,ans,temp);
        System.out.println(ans);
    }

    public static void SubSetRec(int [] nums,int index,List<List<Integer>> ans, List<Integer> temp){
        if (index >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        SubSetRec(nums,index+1,ans,temp);
        temp.removeLast();
        SubSetRec(nums,index+1,ans,temp);
    }
}
