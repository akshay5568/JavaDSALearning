package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum2(new int[]{10,1,2,7,6,1,5},8);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationSum2Rec(candidates,target,ans,temp);
        return ans;
    }

    public static void combinationSum2Rec(int [] candidates, int target, List<List<Integer>> ans, List<Integer> temp){
        if(target <= 0){
            if(target == 0) ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<candidates.length; i++){
            temp.add(candidates[i]);
            target = target - candidates[i];
            if (target > 0) continue;
            combinationSum2Rec(candidates,target,ans,temp);
            target = target + temp.getLast();
            temp.removeLast();
        }
    }
}
