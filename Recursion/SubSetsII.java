package Recursion;

import java.net.Inet4Address;
import java.util.*;

public class SubSetsII {
    public static void main(String[] args) {
        int [] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> remove = new HashSet<>();
        Arrays.sort(nums);
        subsetsWithDupRec(nums,0,remove,temp);
        return new ArrayList<>(remove);
    }

    static void subsetsWithDupRec(int [] nums,int index, Set<List<Integer>> remove, List<Integer> temp){
        if(nums.length <= index){
            System.out.println(temp);
            remove.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        subsetsWithDupRec(nums,index+1,remove,temp);
        temp.removeLast();
        subsetsWithDupRec(nums,index+1,remove,temp);
    }
}
